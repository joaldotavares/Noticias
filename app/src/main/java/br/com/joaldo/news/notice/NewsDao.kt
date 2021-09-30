package br.com.joaldo.news.notice

class NewsDao {

    fun all(): List<News> {
        return listOf(
            News(
                1,
                "Hamilton fatura 100ª vitória na F1 em final caótico com chuva na Rússia",
                "Norris se nega a parar por pneus intermediários, é surpreendido com temporal e acaba superado pelo piloto da Mercedes, que reassume liderança do campeonato; Verstappen e Sainz completam pódio\n",
                "https://s2.glbimg.com/Uu60SiV68aF4GMIUtmEx4vu9zNs=/0x0:1024x576/540x304/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2021/x/H/55TVz8RDOI7vI44cTszw/gettyimages-1235513842.jpg",
                "A vitória de número 100 de Lewis Hamilton veio com emoção nas voltas finais do GP da Rússia neste domingo, embaralhado pela chuva que chegou de surpresa e se tornou o pesadelo de Lando Norris, pole position e líder de boa parte da disputa: o britânico se recusou a adotar os pneus intermediários e, patinando na pista nos últimos giros, viu o rival da Mercedes tomar a ponta para voltar ao lugar mais alto do pódio, desde julho.\n" +
                        "\n" +
                        "Max Verstappen e Carlos Sainz completam as três primeiras colocações. Além do triunfo, o heptacampeão reassumiu a liderança do campeonato de pilotos." +
                        "A chuva foi decisiva para o desfecho da prova que, nas voltas iniciais, concentrou-se entre Norris e Carlos Sainz, que partiu da segunda colocação e chegou a liderar algumas voltas após superar o britânico na largada. Hamilton, largando em quarto, caiu para sétimo no início da corrida, mas descontou o prejuízo e na metade final da disputa, pressionou o compatriota da McLaren até a precipitação. Neste momento, ele abdicou da vice-liderança para trocar os compostos médios pelos pneus intermediários - decisão que se mostrou acertada.\n" +
                        "\n" +
                        "Max Verstappen fez uma prova de recuperação, largando em 20º após trocar a unidade de potência e outros componentes do carro. A segunda colocação na disputa valeu como uma contenção de danos; embora tenha perdido a liderança do Mundial, a diferença para Hamilton é de apenas dois pontos." +
                        "A largada\n" +
                        "O pole Lando Norris abriu uma boa distância para os rivais nos primeiros metros da prova, mas acabou exposto pela extensão da reta de largada; Carlos Sainz, ao seu lado, quase foi ultrapassado por George Russell, mas defendeu a posição para superar o piloto da McLaren e assumir a liderança.\n" +
                        "\n" +
                        "Lewis Hamilton e Daniel Ricciardo cercara o britânico da Williams na tentativa de aproximação do carro da Ferrari, porém, os dois recuaram; Hamilton caiu para a sétima colocação, vendo Lance Stroll passar em sua frente e tomar a quarta colocação." +
                        "Max Verstappen, que largou em 20º, apareceu em 17º atrás de Nicholas Latifi. Valtteri Bottas, que também trocou de motor antes da prova deste domingo para segurar o holandês, ganhou uma posição e pulou para 15º.\n" +
                        "\n" +
                        "Momentos-chave\n" +
                        "1. Depois de perder três posições na largada, Hamilton passa Alonso e é o sexto colocado, atrás de Ricciardo." +
                        "2. Verstappen começa sua jornada à zona de pontuação: primeiro, ultrapassa Nicholas Latifi e Nikita Mazepin, surgindo em 15º, atrás de Bottas. O finlandês fez a melhor volta da prova provisoriamente mas dois giros depois, não conteve o ataque do rival da RBR e perdeu a 14ª colocação sem muita resistência - apesar da Mercedes ter decidido trocar seu motor para mantê-lo perto do holandês." +
                        "3. Charles Leclerc, que largou em 19º ao lado de Verstappen, ganhou seis posições ainda no início da prova e apareceu em 13º até o 10º giro. O monegasco superou Sebastian Vettel, mas errou e viu o holandês da RBR deixá-lo para trás e ocupar a 12ª colocação à sua frente." +
                        "4. Lance Stroll é o primeiro a ir para a troca de pneus na volta 13, indo de quarto para 15º no momento em que retorna para a pista. Norris, depois das voltas em que esboçou uma reação a Sainz, finalmente ultrapassou o espanhol para recuperar a liderança. No giro seguinte, Russell foi aos boxes, retornando em 14º e dando espaço para Ricciardo tomar a terceira colocação.\n" +
                        "5. Sainz fez seu primeiro pit stop na volta seguinte. Com isso, Ricciardo herdou a vice-liderança da prova e Hamilton pulou para segundo, tendo Sergio Pérez, companheiro de Verstappen - que já vinha em oitavo - em sua cola. Dois giros depois, o holandês já estava na sexta colocação.\n" +
                        "6. Verstappen, na quinta colocação, se aproxima de Alonso enquanto a prova se aproxima de sua metade. Pérez permanece em quarto lugar, cerceando Hamilton, que está a menos de 1s de Ricciardo. Diferença deles para Norris é de 11s.\n" +
                        "7. Na 23ª volta, Ricciardo vai aos boxes para trocar os pneus médios pelos duros mas tem um problema na parada, caindo para 14º; o heptacampeão da Mercedes herda a segunda colocação na disputa." +
                        "\n8. Norris visitou os boxes no giro seguinte e, com uma parada de 2s9, retornou para a disputa em quarto lugar após trocar os pneus duros pelos médios. Depois dele foi a vez de Bottas, que vinha em sétimo, fazer a escolha inversa de compostos e retornar em 14º. Assumindo a antiga posição do colega da Mercedes, Hamilton sobe pra sétimo ao superar Stroll enquanto Verstappen está em décimo, após ultrapassar Russell." +
                        "\n9. Hamilton abriu a asa na 30ª volta e passou Sainz e Pierre Gasly, surgindo em quinto, atrás de Norris. Quatro giros depois, o francês da AlphaTauri foi para a troca de pneus no momento em que Norris ultrapassou Leclerc para entrar no top 3 da prova, atrás de Alonso e Pérez - o monegasco seria superado pelo piloto da Mercedes pouco depois. Mick Schumacher, que vinha em 19º, abandonou a prova com um problema de vazamento hidráulico." +
                        "\n10. Leclerc vem para os boxes na volta 36 e, com problema na fixação de um dos pneus, retorna para a pista em 13º lugar, à frente de Bottas. Alonso e Pérez também param e, com isso, Norris recupera a liderança da prova, tendo Hamilton na segunda colocação. O espanhol da Alpine, encontrando-se no meio do grid após o pit stop, ultrapassou Verstappen pelo sexto lugar." +
                        "\n11. Algumas gotas de chuva começaram a cair a oito voltas para o fim da prova, quando Hamilton se aproximava de Norris e Pérez superou Sainz pelo terceiro lugar. Hamilton foi para os boxes para adotar os pneus intermediários, repetindo a estratégia de Verstappen, Sainz, Bottas, Russell, Raikkonen, Mazepin, Ricciardo e Stroll. Norris, na ponta, optou por permanecer na pista e começou ali seu pesadelo: a chuva apertou e ele, patinando, quase bateu na barreira de proteção. De segundo, caiu para sétimo lugar, com Verstappen assumindo a vice-liderança da disputa nos giros finais."
            ),
            News(
                2,
                "Setor de serviços lidera contratações; veja lista das profissões em alta e em baixa",
                "Levantamento da CNC mostra que atividades do setor de serviços dominam o ranking de geração de vagas com carteira assinada em 12 meses. Já as ocupações que mais perderam vagas foram motorista, cobrador, escriturário, carteiro e professor de ensino superior.",
                "https://s2.glbimg.com/P6re2xZP1yviR8mX6O8ZS7OMJz8=/0x154:2048x1306/1080x608/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/a/1/irj6mSS3eFiHNQe7V9bg/50675416713-632cb8bc29-k.jpg",
                "Profissões do setor de serviços e ocupações relacionadas a atividades operacionais e de início de carreira foram as que mais abriram novas vagas de trabalho com carteira assinada no país em 12 meses, segundo levantamento da Confederação Nacional do Comércio de Bens, Serviços e Turismo (CNC), a partir de dados do Cadastro Geral de Empregados e Desempregados (Caged).\n" +
                        "\n" +
                        "Das 10 ocupações que mais criaram novos postos de trabalho, 8 são do setor de serviços. No topo da lista estão as profissões de alimentador de linha de produção, vendedor do comércio, faxineiro, auxiliar de escritório e servente de obras." +
                        "O levantamento considera o saldo de admissões e desligamentos no período de 12 meses encerrado em julho entre um total de mais de 2.500 ocupações do Caged.\n" +
                        "\n" +
                        "Segundo os dados divulgados pelo Ministério da Economia, o Brasil gerou 316.580 empregos formais em julho, atingindo um saldo de 41,2 milhões de brasileiros empregados, contra 38,1 milhões em julho do ano passado. Por outro lado, ainda são mais de 14 milhões de desempregados no país.\n" +
                        "\n" +
                        "\"Por mais que a economia esteja crescendo alguma coisa, o mercado de trabalho não consegue empregar todas as pessoas que estão procurando emprego. Existem vagas sendo criadas, mas a geração não se tem dado no ritmo da procura\", destaca o economista Fabio Bentes, autor do levantamento da CNC.\n" +
                        "Empregos em alta e profissões promissoras\n" +
                        "O levantamento também listou os empregos com maior expansão percentual no número de profissionais em atividade com carteira assinada, considerando ocupações com pelo menos 50 mil empregos formais no país.\n" +
                        "\n" +
                        "No período de 12 meses, o maior salto relativo no número de empregos formais foi entre empregados domésticos, refletindo o aumento da demanda por esses profissionais após o alto número de demissões na fase mais aguda da pandemia." +
                        "Na segunda posição, aparece o cargo de auxiliar de logística. Levantamento anterior da CNC já tinha mostrado que essa foi a posição com maior crescimento no saldo de postos de trabalho com carteira assinada no país em 2020, com alta de 28,1%." +
                        "Destacam-se profissões relacionadas às áreas de tecnologia da informação, que registraram um grande salto durante à pandemia em meio a mudanças de hábitos de consumo e avanço da digitalização da economia.\n" +
                        "\n" +
                        "Os dados do IBGE mostram que os serviços de tecnologia de informação e os técnico-profissionais são os que mais crescem no país, já tendo superado em mais de 20% o patamar pré-pandemia, enquanto que os serviços prestados às famílias ainda operam 23,2% abaixo do patamar de fevereiro de 2020.\n" +
                        "\n" +
                        "Além de serem áreas que seguem promissoras, as atividades associadas aos chamados serviços modernos possuem uma remuneração média bem mais alta que a paga nos serviços tradicionais.\n" +
                        "\n" +
                        "Profissões em baixa\n" +
                        "Já as ocupações cujo estoque de empregados mais encolheu em termos percentuais em 12 meses foram cobrador, operador de exploração de petróleo, motorista e cabeleireiro." +
                        "Segundo a CNC, o ranking reflete os impactos da pandemia nas cadeias produtivas e também mudanças estruturais provocadas pelo avanço tecnológico no setor de transportes e financeiro.\n" +
                        "\n" +
                        "\"Profissões como carteiro e cobrador já estavam em decadência e que a pandemia de certa forma agravou\", afirma economista."
            ),
            News(
                3,
                "Polícia prende parte de quadrilha que usava nome do Ministério da Saúde para aplicar golpes\n",
                "Investigações apontam que pelo menos meio milhão de reais já foram roubados. Com medo do golpe, cerca de 1.200 pessoas já se negaram a participar da pesquisa que o ministério realmente está fazendo nas capitais e regiões metropolitanas.\n",
                "https://s2.glbimg.com/uZuo-NMQcID44VKUDV6EoFOkLq8=/0x0:1280x852/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/I/7/EXc6tiTLC2lbUk7Z9WiA/f6c367fe-9765-4694-b834-60895259a24d.jpg",
                "A Polícia Civil de São Paulo prendeu parte de uma quadrilha que usava o nome do Ministério da Saúde para aplicar golpes na população.\n" +
                        "\n" +
                        "De um lado da linha está uma pessoa disposta a ajudar a acabar com a pandemia. Do outro, bandidos que usam o nome do Ministério da Saúde para aplicar golpes.\n" +
                        "\n" +
                        "“Ele se apresentou como sendo um funcionário do Ministério da Saúde que estava fazendo uma pesquisa com relação à Covid. Porque eles precisavam ter os dados mais precisos de quantas pessoas que tinham sido contaminadas. De como que tava realmente o grau de transmissão da doença\", conta uma das vítimas.\n" +
                        "Antes de terminar a ligação, os bandidos dizem que a pesquisa só será validada após a pessoa enviar um código de confirmação que chegará por mensagem. É aí que os criminosos têm acesso ao celular da vítima e dão início a um novo ciclo do golpe.\n" +
                        "\n" +
                        "Uma das troca de mensagens foi entre os bandidos e uma pessoa que tirou R\$ 1.300 da poupança e transferiu para a quadrilha.\n" +
                        "\n" +
                        "“Eu recebi a mensagem falando: ‘oi, tudo bem, você pode falar?’ e depois as mensagens de texto me pedindo dinheiro. Que ela tinha uma conta pra pagar, o boleto tava para vencer e tinha esgotado as transações bancárias. Eu até pensei: é a minha sogra\", relata a vítima.\n" +
                        "\n" +
                        "Com medo do golpe, cerca de 1.200 pessoas já se negaram a participar da pesquisa que o Ministério da Saúde realmente está fazendo nas capitais e regiões metropolitanas.\n" +
                        "\n" +
                        "A pesquisa faz ligações, envia mensagens e os agentes vão pessoalmente às casas. Para evitar recusas, o Ministério da Saúde teve que mudar a estratégia na coleta dos dados.\n" +
                        "\n" +
                        "\"O Ministério da Saúde nunca, em nenhum tipo da suas ações, ele solicita a confirmação, envio de código. Sempre que a gente faz contato com a população, é um contato pessoal, ou seja, vai existir uma pessoa do outro lado da linha pra falar com a pessoa, e nunca será solicitado envio de senha, código, de nenhum tipo de informação pessoal\", destaca Daniela Buosi Rohlfs.\n" +
                        "\n" +
                        "A quadrilha está há nove meses aplicando o \"golpe da Covid\". As investigações apontam que, usando o nome do Ministério da Saúde, pelo menos meio milhão de reais já foram roubados pelos bandidos.\n" +
                        "\n" +
                        "A polícia identificou cinco pessoas que vão responder por associação criminosa, estelionato e invasão de dispositivo de informática.\n" +
                        "\n" +
                        "\"A gente não descarta que há hipótese sim da participação de outras pessoas, dentre elas até as pessoas que participavam emprestando contas bancária\", relata Rodrigo Aires, delegado do Deic."
            ),
            News(
                4,
                "Eleições na Alemanha: entenda como os alemães escolhem o novo chanceler",
                "Eleitores votam duas vezes: na primeira, em um candidato a representar o distrito eleitoral. Na segunda, no partido de preferência. Após votação, sigla mais bem votada precisa confirmar a maioria com outras agremiações para levar adiante o nome do indicado a chanceler.",
                "https://s2.glbimg.com/VjdpLCC-1LTgzpfO5poY2JpTrLU=/0x0:5500x3094/1080x608/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/h/6/lvcH80SBqV7wyeBwB4MQ/2021-09-07t095557z-1824849597-rc2xkp90v25j-rtrmadp-3-germany-politics.jpg",
                "A Alemanha escolhe em 26 de setembro os novos congressistas que formarão o Parlamento do país. Com isso, será definido também quem sucederá a atual chanceler Angela Merkel, que decidiu não concorrer à reeleição.\n" +
                        "\n" +
                        "Como um país parlamentarista, a chefia do governo alemão fica a cargo de um representante do Parlamento. Na Alemanha, esse representante é chamado de chanceler — o equivalente ao primeiro-ministro.\n" +
                        "\n" +
                        "Merkel ocupava a chefia do governo alemã desde 2005, como líder do partido União Democrática Crista (CDU, na sigla em alemão). A sigla conseguiu se manter majoritária por mais de uma década na Alemanha, permitindo a continuidade da chanceler no cargo.\n" +
                        "\n" +
                        "O modelo de escolha do chefe de governo é complexo e segue várias etapas. Começa com a votação dos eleitores duas vezes na mesma cédula eleitoral e termina com a aprovação do nome do novo chanceler pelo Parlamento recém eleito. " +
                        "Dois votos por eleitor\n" +
                        "A cédula eleitoral apresenta duas colunas: uma para o primeiro voto (Erststimme, em alemão) e uma para o segundo (Zweitstimme).\n" +
                        "\n" +
                        "No primeiro voto, os eleitores escolhem o candidato a representante de cada um dos 299 distritos eleitorais alemães. Cada partido apresenta seu concorrente, e há a possibilidade da participação de independentes desde que eles tenham ao menos 200 assinaturas de apoiadores." +
                        "Esses 299 distritos são divididos pela Alemanha em territórios de 250 mil habitantes. Isso significa que algumas grandes cidades como Berlim, Hamburgo e Munique levam ao Parlamento mais de um representante.\n" +
                        "\n" +
                        "No segundo voto, o eleitor marca o partido de sua preferência. Não precisa ser necessariamente a mesma agremiação do candidato da primeira votação. Ou seja, se uma pessoa preferiu um representante da CDU para representar seu distrito, ela pode sem problema algum votar no SPD nessa segunda escolha caso prefira essa sigla à outra, como um todo.\n" +
                        "\n" +
                        "Para essa segunda votação, cada partido indica uma lista de lideranças políticas que podem representar cada um dos estados alemães no Parlamento, com ao menos 299 vagas. Nesse caso, os assentos são distribuídos proporcionalmente de acordo com o percentual de votos das siglas na eleição. Aí, cada agremiação ocupa as cadeiras correspondentes de acordo com a ordem da lista definida previamente.\n" +
                        "\n" +
                        "\n" +
                        "Há duas regras importantes sobre a distribuição de assentos que merecem atenção:\n" +
                        "\n" +
                        "Assentos extras — Se um partido obtiver um melhor desempenho na primeira votação (distrital) do que na segunda (por legenda), o número de cadeiras no Parlamento de outro partido aumenta para manter a proporcionalidade. A ideia é evitar que o voto no representante do distrito tenha mais peso do que o voto no partido. Por causa disso, os 598 assentos \"base\" se tornaram, ao fim da última eleição, 709 no total.\n" +
                        "A regra dos 5% — É a cláusula de barreira alemã. Um partido só entra no Parlamento se chegar aos 5% dos votos na votação por legenda. A ideia é evitar que grupos pequenos e extremistas elejam parlamentares."
            ),
            News(
                5,
                "Desconfiança na Presidência da República sobe para 50%, diz Datafolha",
                "Na pesquisa anterior, de julho de 2019, percentual era 31%. Parcela da " +
                        "população que diz não confiar no STF também subiu. Datafolha ouviu presencialmente " +
                        "3.667 pessoas em 190 municípios brasileiros, entre 13 e 15 de setembro. A margem de " +
                        "erro é de dois pontos percentuais, para mais ou para menos.",
                "https://s2.glbimg.com/jBKCsOQvcrKgR86IWj0xROQ2k2Y=/0x57:799x506/1080x608/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/m/m/oR4iKpTjuzADiBYAMcjA/51487148863-647c32eed0-c.jpg",
                "Pesquisa Datafolha publicada no site do jornal “Folha de S.Paulo” na madrugada desta sexta-feira (24) aponta que a parcela dos brasileiros que não confiam na Presidência da República atingiu 50%. Na pesquisa anterior, feita em julho de 2019, esse percentual era de 31%.\n" +
                        "\n" +
                        "A fatia dos que dizem não confiar no Supremo Tribunal Federal (STF) também subiu: foi de 33% em julho de 2019 para 38%. No Congresso, a desconfiança foi de 49%, naquele ano, para 45% agora.\n" +
                        "\n" +
                        "O Datafolha ouviu presencialmente 3.667 pessoas em 190 municípios brasileiros, entre os dias 13 e 15 de setembro. A margem de erro é de dois pontos percentuais, para mais ou para menos.\n" +
                        "\n" +
                        "LEIA TAMBÉM\n" +
                        "\n" +
                        "44% dos brasileiros reprovam desempenho do Congresso, aponta Datafolha\n" +
                        "Datafolha: 56% dizem que o Congresso deve abrir processo de impeachment contra Bolsonaro\n" +
                        "O Datafolha também questionou os brasileiros sobre a confiança em 7 outras instituições e setores da sociedade. Veja os números:\n" +
                        "\n" +
                        "Presidência da República\n" +
                        "Confia muito: 16% (28% em julho de 2019 e 29% em abril de 2019)\n" +
                        "Confia pouco: 33% (40% em julho de 2019 e 41% em abril de 2019)\n" +
                        "Não confia: 50% (31% em julho de 2019 e 29% em abril de 2019)\n" +
                        "STF\n" +
                        "Confia muito: 15% (17% em julho de 2019 e 18% em abril de 2019)\n" +
                        "Confia pouco: 44% (47% em julho de 2019 e 46% em abril de 2019)\n" +
                        "Não confia: 38% (33% em julho de 2019 e 32% em abril de 2019)\n" +
                        "Congresso Nacional\n" +
                        "Confia muito: 4% (7% em julho de 2019 e 8% em abril de 2019)\n" +
                        "Confia pouco: 46% (46% em julho de 2019 e 49% em abril de 2019)\n" +
                        "Não confia: 49% (45% em julho de 2019 e 41% em abril de 2019)\n" +
                        "As Forças Armadas são as instituições que somam maior quantidade entre os que confiam muito e os que confiam pouco: 76% (37% confiam muito + 39% confiam pouco). Ainda assim, a desconfiança aumentou numericamente: eram 19% que não confiavam em 2019, e agora são 22%.\n" +
                        "\n" +
                        "\n" +
                        "Forças Armadas\n" +
                        "Confia muito: 37% (42% em julho de 2019 e 45% em abril de 2019)\n" +
                        "Confia pouco: 39% (38% em julho de 2019 e 35% em abril de 2019)\n" +
                        "Não confia: 22% (19% em julho de 2019 e 18% em abril de 2019)\n" +
                        "Os partidos políticos não têm a confiança de 61% dos entrevistados. A rejeição era de 58% em 2019. E o Congresso Nacional é visto como não confiável por 49%.\n" +
                        "\n" +
                        "Partidos políticos\n" +
                        "Confia muito: 3% (4% em julho de 2019 e 5% em abril de 2019)\n" +
                        "Confia pouco: 35% (36% em julho de 2019 e 39% em abril de 2019)\n" +
                        "Não confia: 61% (58% em julho de 2019 e 54% em abril de 2019)\n" +
                        "Ministério Público e Judiciário têm índices semelhantes. A maioria dos entrevistados confia nessas instituições.\n" +
                        "\n" +
                        "Ministério Público\n" +
                        "Confia muito: 15% (23% em julho de 2019 e 25% em abril de 2019)\n" +
                        "Confia pouco: 53% (52% em julho de 2019 e 50% em abril de 2019)\n" +
                        "Não confia: 30% (23% em julho de 2019 e 22% em abril de 2019)\n" +
                        "Judiciário\n" +
                        "Confia muito: 15% (24% em julho de 2019 e 25% em abril de 2019)\n" +
                        "Confia pouco: 51% (48% em julho de 2019 e 49% em abril de 2019)\n" +
                        "Não confia: 31% (26% em julho de 2019 e 24% em abril de 2019)\n" +
                        "O Datafolha também perguntou aos entrevistados sobre as redes sociais. Disseram que não confiam nelas 53%. Afirmam que confiam 46% (40% um pouco e 6%, muito).\n" +
                        "\n" +
                        "Redes sociais\n" +
                        "Confia muito: 6% (9% em julho de 2019 e 10% em abril de 2019)\n" +
                        "Confia pouco: 40% (42% em julho de 2019 e 45% em abril de 2019)\n" +
                        "Não confia: 53% (46% em julho de 2019 e 44% em abril de 2019)\n" +
                        "A imprensa tinha a desconfiança de 30% há dois anos e agora está com 32%. Dizem confiar na imprensa 66% (soma de confia pouco e muito).\n" +
                        "\n" +
                        "\n" +
                        "Imprensa\n" +
                        "Confia muito: 18% (21% em julho de 2019 e 24% em abril de 2019)\n" +
                        "Confia pouco: 48% (48% em julho de 2019 e 48% em abril de 2019)\n" +
                        "Não confia: 32% (30% em julho de 2019 e 26% em abril de 2019)\n" +
                        "Grandes empresas brasileiras\n" +
                        "Confia muito: 17% (22% em julho de 2019 e 22% em abril de 2019)\n" +
                        "Confia pouco: 51% (53% em julho de 2019 e 51% em abril de 2019)\n" +
                        "Não confia: 29% (24% em julho de 2019 e 26% em abril de 2019)"
            ),
            News(
                6,
                "PF indicia 22 pessoas por envolvimento com comércio ilegal de criptomoedas; Justiça defere " +
                        "bloqueio de R\$ 38 bilhões das contas dos suspeitos",
                "Entre os indiciados está Glaidson Santos e sua mulher Myrellis Yoseline Zerpa. Eles respondem " +
                        "por crimes contra o sistema financeiro nacional e organização criminosa.",
                "https://s2.glbimg.com/XzR0JTl1omovo9NfNW2lpZZAm1A=/0x0:1597x898/540x304/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/m/h/BZye6KTgei01I3m4Ioew/25pf0.jpg",
                "A Polícia Federal (PF) indiciou, nesta quinta-feira (23), 22 pessoas apontadas como suspeitas de integrarem uma organização criminosa e praticarem crimes contra o sistema financeiro na compra de criptomoedas.\n" +
                        "\n" +
                        "Além do indiciamento, a Justiça atendeu um pedido da polícia e do Ministério Público Federal (MPF) e determinou o bloqueio de ate R\$ 38 bilhões de quatro contas da G.A.S. Consultoria e de outros investigados.\n" +
                        "\n" +
                        "Entre os alvos da chamada operação Kryptos, listados no relatório final, estão Glaidson Acácio dos Santos e sua mulher, a venezuelana Myrellis Zerpa. As defesas do casal negam as acusações.\n" +
                        "\n" +
                        "Myrellis está nos Estados Unidos onde tem visto de estudante. A polícia considera que ela é foragida.\n" +
                        "\n" +
                        "Glaidson está preso em uma unidade do sistema penitenciário de Gericino, na Zona Oeste do Rio."
            ),
            News(
                7,
                "Fundação troca temas ricos do livro clássico de ficção científica por aventura espacial genérica",
                "Produção de nível cinematográfico supera o padrão técnico para séries, mas desvio da história escrita por Isaac Asimov vai afastar fãs.",
                "https://s2.glbimg.com/JN7oDnfcH3gwyKyuY2WMc3Qz6C0=/0x0:3840x1920/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/b/S/86ZrU4RzGsItlOpgm4QA/leah-harvey-foundation.jpg",
                "Para quem nunca leu o clássico de ficção científica de Isaac Asimov, \"Fundação\" pode ser uma belíssima nova série. Com produção de nível cinematográfico, ela seduz com locações e designs, com o perdão do trocadilho, de outro mundo.\n" +
                        "\n" +
                        "Infelizmente, fãs do livro de mesmo nome que aguardam há décadas uma versão da obra, considerada por muitos como inadaptável, talvez precisem esperar um pouco mais.\n" +
                        "\n" +
                        "A produção, que estreia os dois primeiros de sua temporada com dez capítulos nesta sexta-feira (24) na Apple TV+, se afasta dos temas ricos da história original em uma busca desnecessária por mais ação, que a transformam em mais uma aventura espacial genérica.\n" +
                        "\n" +
                        "Há exceções importantes, como a já mencionada excelência técnica e um ótimo elenco com nomes conhecidos e figuras novas, mas um início empolgante logo dá lugar a momentos previsíveis e personagens pouco inspirados.\n" +
                        "\n" +
                        "Claramente o resultado conseguido por mentes que até admiram a obra de um dos maiores escritores do gênero de todos os tempos, mas que talvez não tenham entendido tão bem os motivos de seu sucesso." +
                        "Matemática é difícil\n" +
                        "O mais triste é que \"Fundação\" começa bem demais. O primeiro episódio atende a todos os pontos que fãs do livro de 1951, o primeiro de uma trilogia posteriormente estendida pelo autor, sempre quiseram." +
                        "E deve agradar também quem nunca ouviu falar do americano na nascido na Rússia (por mais que seus livros tenham gerado adaptações como \"O homem bicentenário\" e \"Eu, robô\").\n" +
                        "\n" +
                        "\n" +
                        "A abertura da série costura com maestria os principais temas do livro, adaptando em medida necessária – e absolutamente compreensível – pontos da trama que não funcionariam na transição de mídias.\n" +
                        "\n" +
                        "Em \"Fundação\", a humanidade se espalhou por toda a galáxia ao longo de milênios. Tanto que ninguém nem sabe ao certo seu ponto de origem.\n" +
                        "\n" +
                        "Acima dos trilhões de habitantes de incontáveis planetas está o Império, responsável pelo delicado equilíbrio de toda a existência." +
                        "É compreensível, então, que a presença na capital de um professor influente, Hari Seldon (Jared Harris), e suas teorias sobre a queda da dinastia e uma provável era de caos e conflitos, seja vista como ameaça.\n" +
                        "\n" +
                        "O problema é que as chances que ele esteja certo são reais. Principal estudioso de uma ciência conhecida como psico-história, ele utiliza matemática para encontrar padrões em grandes populações. Quanto maior o grupo, maior sua precisão – e parece que trilhões, potencialmente até mais, formam um grupo bem grande.\n" +
                        "\n" +
                        "Ele prevê que em poucos séculos o Império será fragmentado, assim como aconteceu antes com outras organizações poderosas. O resultado será 30 mil anos de trevas.\n" +
                        "\n" +
                        "A decadência é inevitável, mas ele tem um plano. Caso lhe deem a chance de formar a Fundação, uma instituição com o intuito de reunir todo o conhecimento da humanidade em uma enciclopédia, esse longo período pode durar apenas um milênio."
            ),
            News(
                8,
                "Após recuo de Ministério da Saúde, capitais anunciam vacinação de adolescentes",
                "Imunização ocorrerá para adolescentes de Brasília, Cuiabá e Macapá. Na quarta, Ministério da Saúde recuou e voltou a liberar a imunização desse público contra a Covid.",
                "https://s2.glbimg.com/zPUUdJCpds3aeXqOD434cx0eJVo=/0x73:2048x1225/540x304/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/E/t/BDiRZzTaGMmtQZhVP2SQ/51478891452-a31ce8e3de-k.jpg",
                "Recuo\n" +
                        "A imunização na faixa etária foi retomada um semana após o ministro da Saúde, Marcelo Queiroga, criticar campanha antecipada dos estados e falar que existem \"eventos adversos a serem investigados\".\n" +
                        "\n" +
                        "\"Os benefícios da vacinação são maiores do que os eventuais riscos dos eventos adversos da sua aplicação\", informou a pasta na quarta-feira (22). \"Comparando tudo o que foi aplicado, mesmo com esses supostos erros de imunização, é um percentual muito baixo (...) então, hoje o ministério não suspende mais de forma cautelar a imunização em adolescentes sem comorbidades\".\n" +
                        "\n" +
                        "O ministério disse que, apesar da retomada, os grupos vulneráveis devem ser priorizados: \"não só o grupo com comorbidades, mas a população que precisa de reforço e o encurtamento de prazo\". Segundo a secretária de Enfrentamento à Covid-19, Rosana Leite Melo, todos os brasileiros devem ser imunizados até o final de 2021, mas o Plano Nacional de Imunizações (PNI) precisa ser respeitado pelos estados e municípios.\n" +
                        "\n" +
                        "Comitê com Anvisa e Fiocruz\n" +
                        "O anúncio ocorre após um Comitê formado por representantes do ministério, da Agência Nacional de Vigilância Sanitária (Anvisa) e da Fundação Oswaldo Cruz (Fiocruz) confirmar que a morte de uma jovem de 16 anos de São Bernardo do Campo, ABC Paulista, não está relacionada com a vacinação contra o coronavírus.\n" +
                        "\n" +
                        "A Anvisa participou de uma reunião do Comitê Interinstitucional de Farmacovigilância de Vacinas e outros Imunobiológicos (CIFAVI) na manhã da terça-feira (21), em que os especialistas detalharam o caso. O processo foi validado e o diagnóstico referendado pelos membros da CIFAVI.\n" +
                        "\n" +
                        "\"O processo investigativo foi validado pelos membros do CIFAVI e o diagnóstico referendado. (...) A causalidade foi classificada como coincidente, ou seja, descartou-se a possibilidade de o óbito ter sido relacionado à administração da vacina\", afirmou a Anvisa em nota.\n" +
                        "\n" +
                        "A Anvisa já havia apontado na segunda-feira (20) que não havia relação causal entre a morte da adolescente em 2 de setembro, com a vacina da Pfizer contra a Covid-19." +
                        "O diagnóstico referendado pela CIFAVI concluiu que a jovem não apresentou qualquer doença cardiológica e sua morte foi causada por um quadro clínico característico de Púrpura Trombótica Trombocitopênica (PTT), uma doença autoimune.\n" +
                        "\n" +
                        "Anteriormente, no dia 17 de setembro, a Secretaria de Estado da Saúde de São Paulo já havia concluído que a morte da jovem decorreu da PTT.\n" +
                        "\n" +
                        "Na ocasião, a Secretaria afirmou que se tratava de \"uma doença autoimune, rara e grave, normalmente sem uma causa conhecida capaz de desencadeá-la, e não há como atribuir relação causal entre PTT e a vacina contra COVID-19 de RNA mensageiro, como é o caso da Pfizer\", afirmou a secretaria."
            ),
            News(
                9,
                "Banco Central da China declara ilegais todas as transações com criptomoedas",
                "Bitcoin caiu quase 5% depois do anúncio, que representa uma intensificação da repressão sobre esse tipo de operação.",
                "https://s2.glbimg.com/WAlnPQevDk_p_Ztv4PYvYCpQK5I=/0x230:4240x2615/540x304/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/0/b/ugqOcQR6uXXQUcI06HIw/foto-01-real-invest-materia-05.jpg",
                " Banco Central da China decidiu nesta sexta-feira (24) que todas as transações financeiras com criptomoedas são ilegais, o que representa uma uma intensificação da repressão sobre esse tipo de operação e comércio.\n" +
                        "\n" +
                        "\"As atividades comerciais vinculadas a moedas virtuais são atividades financeiras ilegais\", anunciou o BC da China em um comunicado, que também afirma que isto \"coloca em grave perigo os ativos das pessoas\"." +
                        "O Bitcoin caiu quase 5%, para US\$ 42.874, depois do anúncio do banco central da China, segundo a agência Reuters.\n" +
                        "\n" +
                        "Com a medida, bolsas estrangeiras ficam proibidas de fornecer serviços relacionados a criptomoedas a investidores do continente via internet.\n" +
                        "\n" +
                        "A cotação das criptomoedas, incluindo o bitcoin, registrou grandes flutuações nos últimos meses. Isso se deu, em parte, devido às regulamentações chinesas, que pretendem prevenir a especulação financeira e a lavagem de dinheiro.\n" +
                        "\n" +
                        "Em maio, as autoridades chinesa já tinham proibido bancos e firmas de pagamento de fornecer serviços relacionados a transações de criptomoeda.\n" +
                        "\n" +
                        "O que está proibido\n" +
                        "Em seu comunicado, o Banco Central da China adverte que aqueles que não respeitarem as normas serão \"investigados por responsabilidade penal, de acordo com a lei\", reforçando a linha dura adotada pelo país contra os rivais digitais à emissão de dinheiro pelo governo." +
                        "A decisão proíbe todas as atividades financeiras vinculadas com criptomoedas, como:\n" +
                        "\n" +
                        "o comércio com criptomoedas,\n" +
                        "a venda de \"tokens\",\n" +
                        "transações que envolvem derivados de criptomoedas, e\n" +
                        "\"arrecadação de fundos ilegais\".\n" +
                        "O Banco Central da China afirmou que, nos últimos anos, \"o comércio e a especulação com bitcoin e outras moedas virtuais se estenderam, alterando a ordem econômica e financeira, aumentando a lavagem de dinheiro, a arrecadação de fundos ilegais, os esquemas de pirâmides e outras atividades criminosas e ilegais\".\n" +
                        "\n" +
                        "Em junho, as autoridades chinesas informaram que mais de 1.000 pessoas foram detidas por lucrar com atividades criminosas para comprar criptomoedas."
            ),
            News(
                10,
                "Hospitais do RS relatam impactos em atendimentos após órgão federal suspender produção de radiofármacos",
                "Instituto de Pesquisas Energéticas e Nucleares não recebeu recursos suficientes para manter produção de insumos utilizados no diagnóstico e no tratamento de câncer. Ministério da Ciência, Tecnologia e Inovação diz que liberação de verba depende do Congresso.",
                "https://s2.glbimg.com/JNBcqNQeFsdl8EaeKONWVzjgLik=/0x49:907x559/540x304/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/K/u/6outdFST2bWl2PaY6UMQ/whatsapp-image-2021-09-23-at-18.58.11.jpeg",
                "A suspensão da produção de remédios utilizados no diagnóstico e no tratamento de câncer alerta hospitais do Rio Grande do Sul, que já relatam reflexos no atendimento de pacientes. Na segunda-feira (20), o Instituto de Pesquisas Energéticas e Nucleares (IPEN) paralisou a fabricação de radiofármacos e radioisótopos por tempo indeterminado em razão da falta de verba.\n" +
                        "\n" +
                        "O órgão é vinculado ao Ministério da Ciência, Tecnologia e Inovação (MCTI), que, na quarta (22), liberou R\$ 19 bilhões para que o IPEN mantenha a operação. Contudo, a verba corresponde a 21% dos R\$ 89,7 milhões necessários para que o instituto continue sua produção até o fim do ano. A pasta afirma que o ingresso de recursos depende de aprovação no Congresso. Veja nota abaixo\n" +
                        "\n" +
                        "No Instituto do Cérebro (InsCer), mantido pela PUCRS, de 65 a 70 pacientes com câncer já são afetados pela falta de tecnécio, elemento químico utilizado para exames diagnósticos. O médico Diego Pianta, que atua na unidade, afirma que a medicina nuclear depende do insumo.\n" +
                        "\n" +
                        "\"Se a gente não tem o tecnécio, a gente para a medicina nuclear no Brasil. Tudo depende de tecnécio\", alerta." +
                        "Pianta ainda explica que não é possível armazenar o isótopo em razão de sua meia-vida, que é o tempo necessário para que metade dos átomos de um isótopo radioativo se desintegre.\n" +
                        "\n" +
                        "\"A gente tem certeza que, a partir do dia 27, não tem mais material radioativo chegando. Do tecnécio, a meia-vida é de seis horas, ou seja, a cada seis horas, metade dele desaparece\", comenta.\n" +
                        "\n" +
                        "A falta do insumo não afeta apenas pacientes com câncer, explica o médico do InsCer. O exame de cintilografia, uma técnica de diagnóstico por imagem, também é feito em pacientes com problemas cardíacos, renais e pulmonares, inclusive embolias provocadas pela Covid-19. Além disso, o instituto relata preocupação com os estoque de iodo, lutécio e MIBG.\n" +
                        "\n" +
                        "Preocupação em hospitais da Capital\n" +
                        "O Hospital de Clínicas de Porto Alegre (HCPA), por exemplo, ainda tem insumos suficientes para manter o gerador de tecnécio. Sem a garantia de entrega por parte do IPEN na próxima semana, a instituição já procura um outro fornecedor para manter o serviço.\n" +
                        "\n" +
                        "Por outro lado, o hospital já não tem iodo, usado para tratamento de algumas doenças da tireoide, em estoque. Nenhum paciente deixou de ser atendido, mas, segundo a chefe do Serviço de Farmácia do HCPA, Thalita Silva Jacoby, a instituição depende de novas remessas do IPEN.\n" +
                        "\n" +
                        "\"No HCPA, o cenário é preocupante, pois não recebemos até o momento nenhum documento oficial do IPEN referente ao fornecimento de gerador de tecnécio e iodo para a próxima semana\", diz.\n" +
                        "Caso o IPEN não atenda a demanda de insumos para o gerador de tecnécio, o hospital terá que restringir a realização de exames de cintilografia somente para pacientes internados. Nesse caso, os exames ambulatoriais serão cancelados."
            )
        )

    }
}
