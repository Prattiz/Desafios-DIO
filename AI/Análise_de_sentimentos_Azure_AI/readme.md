#  Análise de Sentimentos com Azure AI Language Studio  

O **Sentiment and Opinion Mining** é uma solução disponível no **Language Studio da Azure**, permitindo a identificação de sentimentos **positivos, negativos e neutros** em frases e textos. Este repositório contém exemplos práticos de testes realizados na plataforma. As etapas documentadas fazem parte do **Bootcamp Microsoft Azure AI Fundamentals, oferecido pela DIO**.  

![Static Badge](https://img.shields.io/badge/Inteligência_Artificial_(IA)-blue)   
![Static Badge](https://img.shields.io/badge/Microsoft_Azure-blue)  
![Static Badge](https://img.shields.io/badge/Azure_Language_Studio-blue)  
![Static Badge](https://img.shields.io/badge/Speech_Recognition-blue)  
![Static Badge](https://img.shields.io/badge/Sentiment_Mining-blue)  

## Tópicos  
1. [Passo a Passo](#passo-a-passo)  
2. [Resultados Obtidos](#resultados-obtidos)  
3. [Conclusões e Aprendizados](#conclusões-e-aprendizados)  

## Passo a Passo  

Os testes seguiram as diretrizes da Microsoft Learn. Para informações detalhadas, acesse a documentação oficial: [Analyze text with Language Studio](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/06-text-analysis.html).  

### Criando um Recurso no Azure Language Service  

Antes de utilizar o **Language Studio**, é necessário configurar um recurso associado à conta Azure. Para isso:  

1. Acesse o portal da Azure: [https://portal.azure.com](https://portal.azure.com).  
2. No painel de criação de recursos, selecione **Language Service** e clique em "Criar".  

<div align="center">  
    <img src="images/1.png" alt="Criar um recurso" width="600"/>  
</div>  

<div align="center">  
    <img src="images/2.png" alt="Configuração do recurso" width="600"/>  
</div>  

3. Aguarde a conclusão do processo de implantação.  

### Conectando o Recurso ao Language Studio  

Após criar o serviço, ele deve ser vinculado ao **Language Studio** para que possa ser utilizado. Siga os passos:  

1. Acesse o [Language Studio](https://language.cognitive.azure.com/home).  
2. No menu inicial, clique em **"Select a resource"** para visualizar os serviços disponíveis.  

<div align="center">  
    <img src="images/3.png" alt="Selecionar um recurso" width="800"/>  
</div>  

3. Escolha o recurso recém-criado e confirme.  

<div align="center">  
    <img src="images/4.png" alt="Configurar o recurso padrão" width="800"/>  
</div>  

### Escolhendo e Testando o Serviço no Language Studio  

Com o recurso configurado, o painel inicial do **Language Studio** exibirá diversas ferramentas disponíveis. Neste experimento, utilizamos a funcionalidade **"Analyze sentiment and mine opinions"**, localizada na aba **"Classify text"**.  

<div align="center">  
    <img src="images/5.png" alt="Serviços do Language Studio" width="800"/>  
</div>  

## Resultados Obtidos  

Na tela de análise, é possível inserir um texto, definir o idioma e ativar a opção de **opinion mining**. Para este teste, utilizei um trecho do livro de Mateus, da Bíblia.  

<div align="center">  
    <img src="images/6.png" alt="Teste de análise" width="800"/>  
</div>  

O resultado apontou que a maior parte do texto foi classificada como **negativa (65%)**, porém, a confiança do modelo nessa classificação foi de apenas **25%**. Um detalhe interessante é que algumas sentenças tiveram um nível alto de confiança, enquanto outras foram classificadas como **100% negativas**, mas com **0% de confiança**.  

<div align="center">  
    <img src="images/7.png" alt="Resultado de Sentimento" width="400"/>  
</div>  

<br>  

<div align="center">  
    <img src="images/8.png" alt="Detalhes da Análise" width="600"/>  
</div>  

<br>  

<div align="center">  
    <img src="images/10.png" alt="Análise de Sentimento" width="600"/>  
</div>  

O **opinion mining** também gerou algumas análises específicas sobre as opiniões identificadas no texto:  

<div align="center">  
    <img src="images/9.png" alt="Opinion Mining" width="600"/>  
</div>  

## Conclusões e Aprendizados  

A análise automatizada de sentimentos e opiniões pode ser extremamente útil para avaliar **feedbacks de usuários** e opiniões sobre produtos e serviços. No entanto, esse experimento mostrou que a ferramenta funciona melhor em textos **explicitamente opinativos**, como avaliações de consumidores.  

Quando aplicada a um texto mais neutro ou narrativo, como um trecho da Bíblia, a ferramenta teve dificuldades para interpretar o **contexto geral**, pois a análise ocorre **sentença por sentença**, sem levar em conta a estrutura completa do texto.  

Esse resultado sugere que uma abordagem mais avançada — capaz de compreender conexões entre frases e analisar o conteúdo como um todo — poderia gerar insights mais precisos. 🚀