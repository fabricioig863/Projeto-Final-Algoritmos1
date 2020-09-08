import javax.swing.JOptionPane;

public class Trabalho2 {

	public static void main(String[] args) {

		String produto;
		int control, contador;
		double preco, tem_desconto;

		do {
			control = Integer.parseInt(JOptionPane.showInputDialog(
					"Olá Seja Bem vindo ao Botteco - Nós bebe mas não cai!!! Por favor selecione uma das opções abaixo: \n ( 1-Refrigerantes  2-Cervejas  3-Vinhos  4-Whisky  5-Cerveja Artesanal  6-Sair )"));
			switch (control) {
				case 1:
					String menu = "Segue nosso menu de Refrigerantes: \n Coca Cola 2L R$6.00 \n Coca cola lata 350ml R$3.50 \n Fanta Laranja 2L R$4.00 \n Fanta Uva 2L R$5.00 \n Fanta Laranja lata R$3.50 \n Fanta uva lata R$3.50 \n Sprite 2L R$4.00 \n Sprite 350ml R$3.50 \n Atenção: é necessário gravar o produto em questão e o valor do mesmo !!!. \n Trabalhamos com Refrigerantes lata e de 2L";
					JOptionPane.showMessageDialog(null, menu);
					produto = JOptionPane.showInputDialog("Digite o produto que deseja comprar");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					tem_desconto = Double.parseDouble(JOptionPane.showInputDialog(
							"Esta compra possui desconto de 10% no valor do produto digite 1 para aceitar! \n1- aceitar \nOBS: Quem não gosta de aceitar um desconto? \n Boas compras !!"));

					if (tem_desconto == 1) {
						JOptionPane.showMessageDialog(null, "Ok. Vamos gerar o seu desconto");
						for (contador = 1; contador <= 3; contador++) {
							JOptionPane.showMessageDialog(null, "Aguarde. Estamos processando seu desconto...");
						}
						double desconto = 10;
						double precoFinal = preco - (preco * desconto / 100);
						JOptionPane.showMessageDialog(null, "Desconto gerado com sucesso...");
						int continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor total da compra:\n" + produto
								+ "\n Total R$ " + precoFinal + "\n Deseja efetuar a compra ? \n1- Sim \n2- Não"));
						if (continuar == 1) {
							JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.... Obrigado pela preferência!!!");
						} else if (continuar == 2) {
							JOptionPane.showMessageDialog(null, "Ok. Obrigado por comparecer a nossa Loja. Volte sempre!!!");
						}
					}
					break;
				case 2:
					String catalogo = "Segue nossas promoções de cervejas: \nCerveja BRAHMA Chopp 350ml LT - 12U R$31.08 - 1Uni R$2.59\n Cerveja BUDWEIRSER 350ml LT - 12U R$32.28 - 1Uni R$2.69 \n Cerveja STELLA ARTOIS 310ml LT - 12U R$40.68 - 1Uni R$3.39 \n Cerveja ORIGINAL 350ml LT - 12U R$33.48  1Uni R$2.79\n Cerveja SKOL 350ml LT - 12U R$32.28 1Uni R$2.69 \n Atenção: é necessário gravar o produto em questão e o valor do mesmo. \n Trabalhamos com Cervejas latas e com fardo de 12!!!";
					JOptionPane.showMessageDialog(null, catalogo);
					produto = JOptionPane.showInputDialog("Digite o produto que deseja comprar");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					tem_desconto = Double.parseDouble(JOptionPane.showInputDialog(
							"Esta compra possui desconto de 15% no valor do produto digite 1 para aceitar! \n1- aceitar \nOBS: Quem não gosta de aceitar um desconto? \n Boas compras !!"));

					if (tem_desconto == 1) {
						JOptionPane.showMessageDialog(null, "Ok. Vamos gerar o seu desconto");
						for (contador = 1; contador <= 3; contador++) {
							JOptionPane.showMessageDialog(null, "Aguarde. Estamos processando seu desconto...");
						}
						double desconto = 15;
						double precoFinal = preco - (preco * desconto / 100);
						JOptionPane.showMessageDialog(null, "Desconto gerado com sucesso...");
						int continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor total da compra:\n" + produto
								+ "\n Total R$ " + precoFinal + "\n Deseja efetuar a compra ? \n1- Sim \n2- Não"));
						if (continuar == 1) {
							JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.... Obrigado pela preferência!!!");
						} else if (continuar == 2) {
							JOptionPane.showMessageDialog(null, "Ok. Obrigado por comparecer a nossa Loja. Volte sempre!!!");
						}
					}
					break;
				case 3:
					String opcao = "Segue nossas promoções de vinhos para o inverno: \nVinho Francês reserva 750ml Uni - R$69.90 \nVinho Francês 750ml seco Uni - R$19.90\nVinho Italiano suave Uni - R$21.90 \nVinho Chileno Elite seco Uni - R$65,90 \nVinho Espanhol suave Uni - R$68.90 \n Atenção: é necessário gravar o produto em questão e o valor do mesmo !!!";
					JOptionPane.showMessageDialog(null, opcao);
					produto = JOptionPane.showInputDialog("Digite o produto que deseja comprar");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					tem_desconto = Double.parseDouble(JOptionPane.showInputDialog(
							"Esta compra possui desconto de 20% no valor do produto digite 1 para aceitar! \n1- aceitar \nOBS: Quem não gosta de aceitar um desconto? Ainda mais sendo vinho hehe \n Boas compras !!"));

					if (tem_desconto == 1) {
						JOptionPane.showMessageDialog(null, "Ok. Vamos gerar o seu desconto");
						for (contador = 1; contador <= 3; contador++) {
							JOptionPane.showMessageDialog(null, "Aguarde. Estamos processando seu desconto...");
						}
						double desconto = 20;
						double precoFinal = preco - (preco * desconto / 100);
						JOptionPane.showMessageDialog(null, "Desconto gerado com sucesso...");
						int continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor total da compra:\n" + produto
								+ "\n Total R$ " + precoFinal + "\n Deseja efetuar a compra ? \n1- Sim \n2- Não"));
						if (continuar == 1) {
							JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.... Obrigado pela preferência!!!");
						} else if (continuar == 2) {
							JOptionPane.showMessageDialog(null, "Ok. Obrigado por comparecer a nossa Loja. Volte sempre!!!");
						}
					}
					break;
				case 4:
					String pauta = "Segue nossas promoções de Whisky: \nWhisky Red Label 1L - R$80.00 \nWhisky Jack Daniels 1L - R$139.90 \nWhisky Jhonnie Walker - R$179.00 \nWhisky Ballantine's 1L - R$69.90 \nWhisky Royal salute 1L - R$699.90 \nWhisky Passport 1L - R$39.90 \nWhisky White horse 1L-  R$68.80 \n Atenção: é necessário gravar o produto em questão e o valor do mesmo !!!";
					JOptionPane.showMessageDialog(null, pauta);
					produto = JOptionPane.showInputDialog("Digite o produto que deseja comprar");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					tem_desconto = Double.parseDouble(JOptionPane.showInputDialog(
							"Esta compra possui desconto de 25% no valor do produto digite 1 para aceitar! \n1- aceitar \nOBS: Quem não gosta de aceitar um desconto? Ainda por cima em Whisky. Bora !!!\n Boas compras !!"));

					if (tem_desconto == 1) {
						JOptionPane.showMessageDialog(null, "Ok. Vamos gerar o seu desconto");
						for (contador = 1; contador <= 3; contador++) {
							JOptionPane.showMessageDialog(null, "Aguarde. Estamos processando seu desconto...");
						}
						double desconto = 25;
						double precoFinal = preco - (preco * desconto / 100);
						JOptionPane.showMessageDialog(null, "Desconto gerado com sucesso...");
						int continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor total da compra:\n" + produto
								+ "\n Total R$ " + precoFinal + "\n Deseja efetuar a compra ? \n1- Sim \n2- Não"));
						if (continuar == 1) {
							JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.... Obrigado pela preferência!!!");
						} else if (continuar == 2) {
							JOptionPane.showMessageDialog(null, "Ok. Obrigado por comparecer a nossa Loja. Volte sempre!!!");
						}
					}
					break;
				case 5:
					String lista = "Segue nossas promoções de Cervejas Artesanal: \n Bohemia 838 Pale Ale uni LT - R$3.99 \nColorado Appia uni LT  - R$4.99 \nOpa Bier uni LT - R$2.99 \nOpa Bier Weizen uni 600ml - R$5.90 \nLohn Bier Pilsen uni 600ml - R$10.90 \nEisenbahn Pilsen uni LT - R$4.90 \n Atenção: é necessário gravar o produto em questão e o valor do mesmo !!!";
					JOptionPane.showMessageDialog(null, lista);
					produto = JOptionPane.showInputDialog("Digite o produto que deseja comprar");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					tem_desconto = Double.parseDouble(JOptionPane.showInputDialog(
							"Esta compra possui desconto de 15% no valor do produto digite 1 para aceitar! \n1- aceitar \nOBS: Quem não gosta de aceitar um desconto? Desconto é sempre bom !!! \nBoas compras !!"));

					if (tem_desconto == 1) {
						JOptionPane.showMessageDialog(null, "Ok. Vamos gerar o seu desconto");
						for (contador = 1; contador <= 3; contador++) {
							JOptionPane.showMessageDialog(null, "Aguarde. Estamos processando seu desconto...");
						}
						double desconto = 15;
						double precoFinal = preco - (preco * desconto / 100);
						JOptionPane.showMessageDialog(null, "Desconto gerado com sucesso...");
						int continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor total da compra:\n" + produto
								+ "\n Total R$ " + precoFinal + "\n Deseja efetuar a compra ? \n1- Sim \n2- Não"));
						if (continuar == 1) {
							JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.... Obrigado pela preferência!!!");
						} else if (continuar == 2) {
							JOptionPane.showMessageDialog(null, "Ok. Obrigado por comparecer a nossa Loja. Volte sempre!!!");
						}
					}
					break;
				/* 6 - Sair */
				case 6:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Essa opção não existe");
			}
		} while (control != 6);
	}
}