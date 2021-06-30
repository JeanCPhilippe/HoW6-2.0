package com.example.how.Model;

import com.example.how.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PontosTur
{

    public static List<Pontos> pontosteste()
    {
        return (List<Pontos>) Arrays.asList
        (
             Pontos.PontosB.builder()
                .setNome("Cristo Redentor")
                .setEnd("Parque Nacional da Tijuca - Alto da Boa Vista, Rio de Janeiro - RJ")
                .setImg(R.drawable.cristoredentor)
                .setDesc("Cristo Redentor é uma estátua art déco que retrata Jesus Cristo," +
                        "localizada no topo do morro do Corcovado, a 709 metros acima do nível " +
                        "do mar, no Parque Nacional da Tijuca")
                .build(),

                Pontos.PontosB.builder()
                .setNome("Parque Ibirapuera")
                .setEnd("Av. Pedro Álvares Cabral - Vila Mariana, São Paulo - SP")
                .setImg(R.drawable.parque)
                .setDesc("O Parque Ibirapuera é um parque urbano localizado na cidade de São Paulo," +
                        "Brasil. Em 2017, foi o parque mais visitado da América Latina, com " +
                        "aproximadamente 14 milhões de visitas, além de ser um dos " +
                        "locais mais fotografados do mundo.")
                .build(),

                Pontos.PontosB.builder()
                .setNome("Pelourinho")
                .setEnd("Salvador - Bahia")
                .setImg(R.drawable.pelourinho)
                .setDesc("O centro histórico de Salvador, na Bahia, é uma atração indispensável" +
                        " no roteiro de quem visita a capital baiana. Suas ladeiras com calçamento" +
                        " pé de moleque são palco para apresentações de grupos de música e " +
                        "capoeira, além de abrigar igrejas históricas do século XVIII e casarões" +
                        " coloniais que funcionam como restaurantes, bares, lojas de artesanato," +
                        " museus e centros culturais.")
                .build(),

                Pontos.PontosB.builder()
                .setNome("Porto de Galinhas")
                .setEnd("Porto de Galinhas está localizada em Pernambuco, no município de Ipujoca")
                .setImg(R.drawable.porto)
                .setDesc("A praia mais famosa do litoral de Pernambuco é um dos imperdíveis" +
                        " pontos turísticos do Brasil. Em meio às águas cristalinas e esverdeadas," +
                        " barreiras de recifes e corais formam piscinas naturais cheias de " +
                        "peixinhos coloridos.")
                .build()
        );
    }
}
