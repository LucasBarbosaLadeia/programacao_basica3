package model;

import java.util.List;



    public class Cena {
        private Integer idCena;
        private String descricao;

        public Integer getIdCena() {
            return idCena;
        }

        public void setIdCena(Integer idCena) {
            this.idCena = idCena;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return "Cena{" +
                    "idCena=" + idCena +
                    ", descricao='" + descricao + '\'' +
                    ", itens=" + itens +
                    '}';
        }

        public List<Item> getItens() {
            return itens;
        }

        public void setItens(List<Item> itens) {
            this.itens = itens;
        }

        private List<Item> itens;
    }

}
