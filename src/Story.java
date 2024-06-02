
//isso aqui so serve pra guardar as strings da historia
public class Story {
    public static void printintro(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
              Você sente a água fria pingando em seu rosto. Seus olhos se abrem lentamente,
              confrontando uma escuridão densa e opressiva. Seus pensamentos são turvos,
              suas lembranças uma névoa distante. Onde estou? Quem sou eu?
              """);
        Util.anythingToContinue();
    }

    public static void firsAct(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
             Ainda confuso, você se levanta com cuidado. De repente, você começa a escutar grunhidos
             e algo se rastejando.
             """);
        Util.anythingToContinue();
    }

    public static void secondAct(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
             A caverna se alarga repentinamente, revelando uma vasta galeria de pedra.
             As paredes ásperas e irregulares refletem os sons de cada passo, criando uma cacofonia
             de eco que preenche o espaço. Estalactites pendem do teto alto como dentes afiados,
             prontos para cair a qualquer momento. O ar úmido e frio é permeado pelo cheiro de terra
             molhada e mofo. Sombras dançam nas paredes, brincando com a mente e obscurecendo a visão,
             enquanto o desconhecido se estende adiante em todas as direções.""");
        Util.anythingToContinue();
    }


    public static void thirdAct(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
            Adentrando mais profundamente na caverna, o caminho leva a uma ravina profunda.
            Pontes estreitas de pedra cruzam sobre o vazio negro abaixo, onde correntes de água
            correm em riachos invisíveis. A escuridão é mais intensa aqui, parecendo devorar
            qualquer luz que ouse penetrá-la. Sons sinistros ecoam pelas paredes íngremes,
            criando uma cacofonia de murmúrios e rugidos que ecoam pela vastidão desolada.
            O ar está carregado de uma energia sombria que sussurra promessas de perigos
            desconhecidos.""");
        Util.anythingToContinue();
    }

    public static void fourthAct(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
            Você alcançou a última área da caverna. Aqui, as paredes se erguem como sentinelas silenciosas,
            suas superfícies ásperas e marcadas pela passagem do tempo. O chão está coberto de detritos e destroços,
            testemunhos do caos que se desenrolou neste lugar esquecido. Uma sensação de peso paira no ar,
            como se o próprio ambiente estivesse carregado com a energia da escuridão que o permeia.
            À frente, uma escuridão ainda mais profunda aguarda, prometendo desafios finais e segredos sombrios
            que aguardam serem revelados.""");
        Util.anythingToContinue();
    }

    public static void end(Player player){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
                Com um estrondo ensurdecedor, o Gólem das Profundezas finalmente sucumbe diante da determinação e coragem do herói.
                Seu corpo colossal de pedra desmorona em pedaços, ecoando pelo salão em um último suspiro de resistência.
                O silêncio se instala na caverna, interrompendo o eco constante das batalhas anteriores.
                Os raios de luz que penetram pelas fissuras no teto iluminam a cena, revelando o herói, respirando ofegante,
                mas triunfante diante do imponente monte de destroços que um dia foi o temido guardião da caverna.
                As sombras que antes dominavam o ambiente recuam, dissipando-se lentamente em resposta à vitória do jogador.
                                
                Com o Gólem derrotado, o caminho à frente se abre, convidando o herói a avançar em direção à próxima aventura.
                Mas, por enquanto, um momento de descanso e reflexão é merecido. A caverna ecoa apenas com o som da respiração do herói,
                enquanto ele contempla sua jornada até este ponto e se prepara para os desafios que aguardam além das sombras.""");
        System.out.println();
        Util.printSlowly("Até mais " + player.name + "...");
    }
}
