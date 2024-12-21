package Client;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(65));

        System.out.println("**********************************");
        System.out.println("Code          : " + proxy.getCompte(1).getCode());
        System.out.println("Date Creation : " + proxy.getCompte(1).getDateCreation());
        System.out.println("Solde : " + proxy.getCompte(1).getSolde());
        System.out.println("**********************************");

        List<Compte> ListCompte = proxy.getCompteList();



        for(Compte compte: ListCompte)
        {
            System.out.println("Code          : " + compte.getCode());
            System.out.println("Date Creation : " + compte.getDateCreation());
            System.out.println("Solde : " + compte.getSolde());
            System.out.println("-------------------------------------");
        }





    }
}
