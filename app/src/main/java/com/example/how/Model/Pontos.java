package com.example.how.Model;

public class Pontos
{
    private String nome;
    private int Img;
    private String End;
    private String Desc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String end) {
        End = end;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public static class PontosB
    {
        private String nome;
        private int Img;
        private String End;
        private String Desc;

        public PontosB setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PontosB setImg(int img) {
            Img = img;
            return this;
        }

        public PontosB setEnd(String end) {
            End = end;
            return this;
        }

        public PontosB setDesc(String desc) {
            Desc = desc;
            return this;
        }

        private PontosB(){};

        public static PontosB builder()
        {
            return new PontosB();
        }
        public Pontos build()
        {
            Pontos pontos = new Pontos();
            pontos.nome = nome;
            pontos.Img = Img;
            pontos.End = End;
            pontos.Desc = Desc;

            return pontos;
        }
    }
}
