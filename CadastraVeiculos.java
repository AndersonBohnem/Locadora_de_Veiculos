import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraVeiculos {

    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        while (true) {
            boolean escolha = false;
            while (!escolha) {
                try {
                    limpaTela();
                    System.out.println("""
                            Bem vindo a Locadora de Veiculos:

                            1 - Cadastrar Veiculo:
                            2 - Mostrar Veiculos cadastrados:
                            3 - Sair:
                            Digite a opcão que deseja:
                            """);
                    opcao = scan.nextInt();
                    scan.nextLine();
                    escolha = true;
                } catch (Exception e) {
                    limpaTela();
                    scan.nextLine();
                    System.out.println("Digite somente números - Pressione Enter para continuar");
                    scan.nextLine();
                }
            }
            switch (opcao) {
                case 1:
                    cadastraVeiculo(scan);
                    break;
                case 2:
                    limpaTela();
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Veiculos cadastrados:\n");
                    for (Veiculo veiculo : veiculos) {
                        System.out.println(veiculo.toString());
                    }
                    System.out.println("\nPressione enter para continuar!");
                    scan.nextLine();
                    break;
                case 3:
                    limpaTela();
                    System.out.println("Você escolheu sair até mais!\n");
                    return;
                default:
                    System.out.println("Opcão invalida  - Pressione enter para continuar");
                    scan.nextLine();
                    break;
            }
        }
    }

    public static void cadastraVeiculo(Scanner scan) {
        boolean escolha1 = false;
        while (!escolha1) {
            try {
                limpaTela();
                int escolha2 = 0;
                System.out.println("""
                        O seu Veiculo é de Carga ou de Passageiros:

                        1 - Veiculo de Carga:
                        2 - Veiculo de Passageiros:
                        3 - Não cadastrar:
                        """);
                escolha2 = scan.nextInt();
                if (escolha2 == 1) {
                    limpaTela();
                    DeCarga veiculoDeCargas = new DeCarga(null, null, null, 0, 0, null, 0, null, 0, 0, 0, null, null,
                            null, null, 0,
                            0, 0, null, 0);
                    System.out.println("Digite a placa do veiculo: ");
                    String placa = scan.nextLine();
                    veiculoDeCargas.setPlaca(placa);
                    limpaTela();
                    System.out.println("Digite a marca do veiculo: ");
                    String marca = scan.nextLine();
                    veiculoDeCargas.setMarca(marca);
                    limpaTela();
                    System.out.println("Digite o modelo do veiculo:");
                    String modelo = scan.nextLine();
                    veiculoDeCargas.setModelo(modelo);
                    limpaTela();
                    boolean resposta = false;
                    while (!resposta) {
                        try {
                            limpaTela();
                            System.out.println("Digite o ano do modelo: ");
                            int anoModelo = scan.nextInt();
                            veiculoDeCargas.setAnoModelo(anoModelo);
                            resposta = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    boolean resposta1 = false;
                    while (!resposta1) {
                        try {
                            limpaTela();
                            System.out.println("Digite o ano de fabricacão: ");
                            int anoFabricacao = scan.nextInt();
                            veiculoDeCargas.setAnoFabricacao(anoFabricacao);
                            resposta1 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite o chassi do veiculo:");
                    String chassi = scan.nextLine();
                    veiculoDeCargas.setChassi(chassi);
                    limpaTela();
                    boolean resposta2 = false;
                    while (!resposta2) {
                        try {
                            limpaTela();
                            System.out.println("Digite o Código Renavam: ");
                            int renavam = scan.nextInt();
                            veiculoDeCargas.setRenavam(renavam);
                            resposta2 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite a procedência do veiculo: (nacional/importado)");
                    String procedencia = scan.nextLine();
                    veiculoDeCargas.setProcedencia(procedencia);
                    limpaTela();
                    boolean resposta3 = false;
                    while (!resposta3) {
                        try {
                            limpaTela();
                            System.out.println("Digite a altura do veiculo: ");
                            double altura = scan.nextDouble();
                            veiculoDeCargas.setAltura(altura);
                            resposta3 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    boolean resposta4 = false;
                    while (!resposta4) {
                        try {
                            limpaTela();
                            System.out.println("Digite a largura do veiculo: ");
                            double largura = scan.nextDouble();
                            veiculoDeCargas.setLargura(largura);
                            resposta4 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    boolean resposta5 = false;
                    while (!resposta5) {
                        try {
                            limpaTela();
                            System.out.println("Digite a profundidade do veiculo: ");
                            double profundidade = scan.nextDouble();
                            veiculoDeCargas.setProfundidade(profundidade);
                            resposta5 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    // comeca as caracteristicas
                    limpaTela();
                    System.out.println("Digite o tipo do combustivel do veiculo: ");
                    String tipoCombustivel = scan.nextLine();
                    veiculoDeCargas.setTipoCombustivel(tipoCombustivel);
                    limpaTela();
                    System.out.println("Digite o motor do veiculo: ");
                    String motor = scan.nextLine();
                    veiculoDeCargas.setMotor(motor);
                    limpaTela();
                    boolean resposta6 = false;
                    while (!resposta6) {
                        try {
                            limpaTela();
                            System.out.println("Digite a quilometragem do veiculo: ");
                            double quilometragem = scan.nextDouble();
                            veiculoDeCargas.setQuilometragem(quilometragem);
                            resposta6 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    boolean resposta7 = false;
                    while (!resposta7) {
                        try {
                            limpaTela();
                            System.out.println("Digite o consumo Médio do veiculo: ");
                            double consumoMedio = scan.nextDouble();
                            veiculoDeCargas.setConsumoMedio(consumoMedio);
                            resposta7 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite os opcionais do veiculo: ");
                    String opcionais = scan.nextLine();
                    veiculoDeCargas.setOpcionais(opcionais);
                    limpaTela();
                    boolean resposta9 = false;
                    while (!resposta9) {
                        try {
                            limpaTela();
                            System.out.println("Digite a capacidade máxima de carga em KG do veiculo: ");
                            double capacidadeCargaKG = scan.nextDouble();
                            veiculoDeCargas.setCapacidadeCargaKG(capacidadeCargaKG);
                            resposta9 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }

                    veiculos.add(veiculoDeCargas);

                    limpaTela();
                    System.out.println("Cadastro de veiculo de carga concluido com sucesso!");
                    System.out.println("\nPressione enter para continuar!");
                    scan.nextLine();

                    escolha1 = true;

                } else if (escolha2 == 2) {
                    DePassageiros veiculoDePassageiros = new DePassageiros(null, null, null, 0, 0, null, 0, null, 0, 0,
                            0, null,
                            null, null, null, 0, 0, 0, null, 0);

                    limpaTela();
                    System.out.println("Digite a placa do veiculo: ");
                    String placa = scan.nextLine();
                    veiculoDePassageiros.setPlaca(placa);
                    limpaTela();
                    System.out.println("Digite a marca do veiculo: ");
                    String marca = scan.nextLine();
                    veiculoDePassageiros.setMarca(marca);
                    limpaTela();
                    System.out.println("Digite o modelo do veiculo:");
                    String modelo = scan.nextLine();
                    veiculoDePassageiros.setModelo(modelo);
                    limpaTela();
                    boolean resposta = false;
                    while (!resposta) {
                        try {
                            limpaTela();
                            System.out.println("Digite o ano do modelo: ");
                            int anoModelo = scan.nextInt();
                            veiculoDePassageiros.setAnoModelo(anoModelo);
                            resposta = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    boolean resposta1 = false;
                    while (!resposta1) {
                        try {
                            limpaTela();
                            System.out.println("Digite o ano de fabricacão: ");
                            int anoFabricacao = scan.nextInt();
                            veiculoDePassageiros.setAnoFabricacao(anoFabricacao);
                            resposta1 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite o chassi do veiculo:");
                    String chassi = scan.nextLine();
                    veiculoDePassageiros.setChassi(chassi);
                    limpaTela();
                    boolean resposta2 = false;
                    while (!resposta2) {
                        try {
                            limpaTela();
                            System.out.println("Digite o Código Renavam: ");
                            int renavam = scan.nextInt();
                            veiculoDePassageiros.setRenavam(renavam);
                            resposta2 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite a procedência do veiculo: (nacional/importado)");
                    String procedencia = scan.nextLine();
                    veiculoDePassageiros.setProcedencia(procedencia);

                    // comeca as caracteristicas
                    limpaTela();
                    System.out.println("Digite a cor Externa: ");
                    String corExterna = scan.nextLine();
                    veiculoDePassageiros.setCorExterna(corExterna);
                    limpaTela();
                    System.out.println("Digite a cor Interna: ");
                    String corInterna = scan.nextLine();
                    veiculoDePassageiros.setCorInterna(corInterna);
                    limpaTela();
                    System.out.println("Digite o tipo do combustivel do veiculo: ");
                    String tipoCombustivel = scan.nextLine();
                    veiculoDePassageiros.setTipoCombustivel(tipoCombustivel);
                    limpaTela();
                    System.out.println("Digite o motor do veiculo: ");
                    String motor = scan.nextLine();
                    veiculoDePassageiros.setMotor(motor);
                    limpaTela();
                    boolean resposta6 = false;
                    while (!resposta6) {
                        try {
                            limpaTela();
                            System.out.println("Digite a quilometragem do veiculo: ");
                            double quilometragem = scan.nextDouble();
                            veiculoDePassageiros.setQuilometragem(quilometragem);
                            resposta6 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    boolean resposta7 = false;
                    while (!resposta7) {
                        try {
                            limpaTela();
                            System.out.println("Digite o consumo Médio do veiculo: ");
                            double consumoMedio = scan.nextDouble();
                            veiculoDePassageiros.setConsumoMedio(consumoMedio);
                            resposta7 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    boolean resposta8 = false;
                    while (!resposta8) {
                        try {
                            limpaTela();
                            System.out.println("Digite o número de portas do veiculo: ");
                            int numeroPortas = scan.nextInt();
                            veiculoDePassageiros.setNumeroPortas(numeroPortas);
                            resposta8 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }
                    limpaTela();
                    System.out.println("Digite os opcionais do veiculo: ");
                    String opcionais = scan.nextLine();
                    veiculoDePassageiros.setOpcionais(opcionais);
                    limpaTela();
                    boolean resposta9 = false;
                    while (!resposta9) {
                        try {
                            limpaTela();
                            System.out.println("Digite o número de passageiros do veiculo: ");
                            int numeroPassageiros = scan.nextInt();
                            veiculoDePassageiros.setNumeroPassageiros(numeroPassageiros);
                            resposta9 = true;
                            scan.nextLine();
                        } catch (Exception e) {
                            limpaTela();
                            scan.nextLine();
                            System.out.println("Digite somente números:");
                            System.out.println("\nPressione enter para continuar!");
                            scan.nextLine();
                        }
                    }

                    veiculos.add(veiculoDePassageiros);

                    limpaTela();
                    System.out.println("Cadastro de veiculo de passageiros concluido com sucesso!");
                    System.out.println("\nPressione enter para continuar!");
                    scan.nextLine();

                    escolha1 = true;
                } else if (escolha2 == 3) {
                    escolha1 = true;
                }
            } catch (Exception e) {
                limpaTela();
                System.out.println("Opção invalida:");
                System.out.println("\nPressione enter para continuar!");
                scan.nextLine();
            }
        }
    }

    public static void limpaTela() {
        System.out.println("\033[H\033[2J");
    }

}
