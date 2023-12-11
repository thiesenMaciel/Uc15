package com.uc15.atv9.service;

import com.uc15.atv9.data.Moto;
import com.uc15.atv9.data.Venda;
import com.uc15.atv9.data.VendaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    VendaRepository motoRepository;

    @Autowired
    MotoService mService;

    public Venda criarVenda(Venda venda) {
        venda.setId(null);
        motoRepository.save(venda);
        return venda;
    }

    public Venda atualizarVenda(Integer vendaId, Venda vendaRequest) {
        Venda vendaExistente = getVendaId(vendaId);

        vendaExistente.setCliente(vendaRequest.getCliente());
        vendaExistente.setMoto(vendaRequest.getMoto());
        vendaExistente.setDataVenda(vendaRequest.getDataVenda());
        vendaExistente.setValor(vendaRequest.getValor());

        motoRepository.save(vendaExistente);

        return vendaExistente;
    }

    public Venda getVendaId(Integer vendaId) {

        return motoRepository.findById(vendaId).orElse(null);

    }

    public List<Venda> listarTodasVendas() {

        return motoRepository.findAll();

    }

    public void deletarVenda(Integer vendaId) {

        Venda venda = getVendaId(vendaId);

        motoRepository.deleteById(venda.getId());

    }

    public void realizarVenda(Integer motoId) {
        Moto moto = mService.getMotoId(motoId);

        moto.setVendida(true);

        mService.atualizarMoto(moto.getId(), moto);
    }
}
