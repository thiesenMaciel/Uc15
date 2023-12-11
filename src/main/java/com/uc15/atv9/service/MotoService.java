package com.uc15.atv9.service;

import com.uc15.atv9.data.Moto;
import com.uc15.atv9.data.MotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoService {

    @Autowired
    MotoRepository motoRepository;

    public Moto criarMoto(Moto moto) {
        moto.setId(null);
        motoRepository.save(moto);
        return moto;
    }

    public Moto atualizarMoto(Integer motoId, Moto motoRequest) {
        Moto motoExistente = getMotoId(motoId);

        motoExistente.setPlaca(motoRequest.getPlaca());
        motoExistente.setCor(motoRequest.getCor());
        motoExistente.setAno(motoRequest.getAno());
        motoExistente.setValorCusto(motoRequest.getValorCusto());
        motoExistente.setValorVenda(motoRequest.getValorVenda());
        motoExistente.setModelo(motoRequest.getModelo());

        motoRepository.save(motoExistente);

        return motoExistente;
    }

    public Moto getMotoId(Integer motoId) {

        return motoRepository.findById(motoId).orElse(null);

    }

    public List<Moto> listarTodasMotos() {

        return motoRepository.findAll();

    }

    public void deletarMoto(Integer motoId) {

        Moto moto = getMotoId(motoId);

        motoRepository.deleteById(moto.getId());

    }
}
