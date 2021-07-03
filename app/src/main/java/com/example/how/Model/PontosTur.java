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
                .setEnd("Rio de Janeiro - RJ")
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
                .build(),
                Pontos.PontosB.builder()
                        .setNome("Centro Histórico de Porto Seguro")
                        .setEnd("Porto Seguro - Bahia")
                        .setImg(R.drawable.portoseguro)
                        .setDesc("O município de Porto Seguro, no Sul da Bahia, possui atrações " +
                                "variadas, mas uma em especial desperta a curiosidade dos " +
                                "visitantes: o turismo histórico e cultural! Instalado no " +
                                "topo de falésias sobre a orla, o centro abriga prédios " +
                                "considerados importantes na origem do Brasil, como o Marco " +
                                "do Descobrimento, trazido de Portugal por Gonçalo Coelho em 1503. " +
                                "Tombado como Patrimônio Histórico Nacional pelo IPHAN desde " +
                                "1973, o lugar é realmente único. ")
                        .build(),
                Pontos.PontosB.builder()
                        .setNome("Lençóis Maranhenses")
                        .setEnd("Barreirinhas - Maranhão")
                        .setImg(R.drawable.barreirinhas)
                        .setDesc("Os Lençóis Maranhenses, um dos principais pontos turísticos do " +
                                "Brasil para quem viaja ao Maranhão, apresentam paisagens incríveis," +
                                " compostas por quilômetros de dunas de areia com até 40 metros de " +
                                "altura. Ao caminhar pela areia fofa, formando pegadas, o viajante " +
                                "pensa estar em pleno deserto. Mas quando chega ao topo de uma duna" +
                                " e se depara com uma lagoa de águas cristalinas, percebe que o lugar é," +
                                " na verdade, um oásis. Pode até parecer miragem, mas o deserto do Brasil " +
                                "é o único no mundo com milhares de lagoas e piscinas naturais " +
                                "formadas pelas águas da chuva.")
                        .build(),
                Pontos.PontosB.builder()
                        .setNome("Serra do Rio do Rastro")
                        .setEnd("35km da estrada que ligam as cidades de Lauro Müller e Bom Jardim da Serra.")
                        .setImg(R.drawable.serrariodorastro)
                        .setDesc("Além do visual deslumbrante que a serra tem, você certamente " +
                                        "ficará impressionado com o contorno da estrada na encosta " +
                                        "da serra. Não deixe de subir ou descer a serra! Dá um " +
                                        "friozinho na barriga, mas vela muito a pena.\n" +
                                        "Os 35km da estrada ligam as cidades de Lauro Müller e " +
                                        "Bom Jardim da Serra. Percorrê-la é como andar em uma " +
                                        "montanha russa, afinal de contas são 284 curvas ao longo " +
                                        "de todo o trajeto! É claro que a cereja do bolo é o " +
                                        "mirante a 700m de altitude, que ao pôr do sol fica " +
                                        "ainda mais bonito.\n")
                        .build(),
                Pontos.PontosB.builder()
                        .setNome("Cataratas do Iguaçu")
                        .setEnd("Foz do Iguaçu - Paraná ")
                        .setImg(R.drawable.cataratas)
                        .setDesc("Uma das Cataratas mais famosas do mundo, " +
                                "Foz se divide entre Brasil, Argentina e Paraguai, sendo que " +
                                "o nosso país foi privilegiado com o melhor trecho. Os turistas " +
                                "adoram ver as quedas d’água de perto, mas também podem fazer um " +
                                "tour pelo enorme Parque Nacional do Iguaçu, provar a deliciosa " +
                                "carne argentina, fazer compras no freeshop (ou no Paraguai)" +
                                " e conhecer o belo templo budista que tem por lá.")
                        .build(),
                Pontos.PontosB.builder()
                        .setNome("Gramado")
                        .setEnd("Gramado - Paraná")
                        .setImg(R.drawable.gramado)
                        .setDesc("O frio e o charme de Gramado conquista turistas que querem " +
                                "fugir um pouco do típico clima tropical brasileiro. Belas " +
                                "paisagens se formam entre campos de lavanda, pinheiros e " +
                                "araucárias, que são pano de fundo para casas em estilo enxaimel.\n " +
                                "O clima tranquilo predominante fica um pouco mais agitado " +
                                "durante o maior festival de cinema do Brasil e também durante " +
                                "o Natal, que é cheio de luzes e espetáculos. \n " +
                                "O lugar também é o destino perfeito para quem quer degustar um " +
                                "bom vinho, provar deliciosos chocolates, ou até mesmo se " +
                                "divertir na neve.")
                        .build(),
                Pontos.PontosB.builder()
                        .setNome("Pão de Açúcar")
                        .setEnd("Rio de Janeiro - RJ")
                        .setImg(R.drawable.rjpa)
                        .setDesc("Com 395 m de altura, o Pão de Açúcar é lindo de se ver mesmo " +
                                "de longe, mas também rende um passeio muito agradável de " +
                                "bondinho e uma visão 360° da cidade. Lá em cima ainda tem " +
                                "anfiteatro, restaurantes, lojas e o Cocoruto, um museu que " +
                                "conta a história do bondinho.")
                        .build()
        );
    }
}
