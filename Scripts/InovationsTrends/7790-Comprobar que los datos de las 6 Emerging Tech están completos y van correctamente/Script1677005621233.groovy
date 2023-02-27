import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Casos de prueba transversales/NavegacionInicialMIP1.4SkipIntro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjetosManuales/Page_Accenture to acquire SKS Group/Page_Market Intelligence Platform/a_insightsInnovation Trendsexpand_more'))

WebUI.click(findTestObject('Object Repository/Page_Market Intelligence Platform/label_Emerging tech in NTT DATA'))

WebUI.click(findTestObject('Page_Market Intelligence Platform/button_Letsgo'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Large Language Models (LLM) and Visual _e2899b'), 
    'Large Language Models (LLM) and Visual Transformers / Generative AI')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Large Language Models (LLM)'), 
    'Large Language Models (LLM) are natural language processing algorithms based on Transformer-type architectures that have been trained on very large text corpora. Their main application would be the generation of text (pure generation, summarization, information extraction, …) where the available domain data is sparse. These models are normally used in zero-shot or few-shot scenarios using examples to "teach')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Conversational AI'), 'Conversational AI')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Conversation AI is a branch of artificial intelligence'), 
    'Conversation AI is a branch of artificial intelligence that deals with the design and development of intelligent agents that can carry out conversations with humans. Some of the main use cases for conversation AI include customer service, sales, and marketing. By automating conversations with customers, businesses can improve the customer experience by providing quick and accurate responses to customer queries. Some of the technologies that would be defined as conversation AI include natural language processing (NLP), chatbots, and virtual assistants.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Metaverse  XR'), 'Metaverse & XR')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/Gartner define'), 
    'Gartner defines a metaverse as a collective virtual 3D shared space, created by the convergence of virtually enhanced physical and digital reality. A metaverse is persistent, providing enhanced immersive experiences. Gartner expects that a complete metaverse will be device-independent, and will not be owned by a single vendor: It will have a virtual economy of itself, enabled by digital currencies and non-fungible tokens (NFTs). XR is a term used to describe a range of technologies that provide immersive experiences, including virtual reality (VR), augmented reality (AR), and mixed reality (MR). XR can be used for a variety of purposes, including training, education, entertainment, and social interactions.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Customer Data Platforms'), 
    'Customer Data Platforms')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_A customer data platform (CDP) is a'), 
    'A customer data platform (CDP) is a type of software that enables organizations to collect, manage, and activate customer data from multiple sources. CDPs can be used to drive customer segmentation, targeted marketing, and personalized customer experiences. By integrating data from multiple sources, CDPs can provide a complete view of the customer, which can be used to improve customer journeys and increase customer loyalty. Gartner: A customer data platform (CDP) is a software application that supports marketing and customer experience use cases by unifying a company’s customer data from marketing and other channels. CDPs optimize the timing and targeting of messages, offers and customer engagement activities, and enable the analysis of individual-level customer behavior over time.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_MartechAdtech'), 'Martech/Adtech')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_MarTech and AdTech can refer to a wide variety'), 
    '"MarTech" and "AdTech" can refer to a wide variety of different technologies and applications. However, broadly speaking, MarTech generally refers to technology that is used to support marketing activities, while AdTech generally refers to technology that is used to support advertising activities. Some examples of MarTech or AdTech technologies include: - Marketing automation platforms - Customer relationship management (CRM) systems - Social media marketing and management tools - Digital marketing and advertising platforms - Market research tools and platforms - Sales enablement tools - Event management tools - Website optimization and analytics tools')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Process, task and data mining'), 
    'Process, task and data mining')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Process Intelligence applying process mining'), 
    'Process Intelligence applying process mining and task mining monitors and discovers behaviours of business functions. It allows identifying and working on the transformation of processes from their conceptual redesign to the application of advanced technologies. Data mining can be used for a variety of purposes, such as identifying trends or patterns, predicting future events, or providing recommendations. Process and task mining algorithms can be used to automate and improve business processes, or to discover new tasks that need to be performed.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_AI-Augmented Software development'), 
    'AI-Augmented Software development')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_What is AI Assisted Code Development It is a feature'), 
    'What is AI Assisted Code Development? It is a feature that provides assistance during the software development process, guiding users to the right tools and patterns for any situation according to what is learned from millions of anonymized code patterns.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_AI-Enabled AMS'), 'AI-Enabled AMS')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Ai to increase the productivity at operation of AMS'), 
    'Ai to increase the productivity at operation of AMS projects.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Low Code Platforms'), 'Low Code Platforms')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_A low code platform is a software application that allows users'), 
    'A low code platform is a software application that allows users to create and deploy applications without the need for traditional coding or programming. Low code platforms typically provide a visual drag-and-drop interface that simplifies the process of building applications.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Edge Cloud'), 'Edge Cloud')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Edge 2'), 
    '\'Edge Cloud is a cloud computing model in which data and applications are stored on the edge of the network, near the user. Edge Cloud is used to improve performance and reduce latency. The main use cases for Edge Cloud are:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_IoT'), 'IoT')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_The Internet of Things (IoT) is a system of interconnected device'), 
    'The Internet of Things (IoT) is a system of interconnected devices, sensors, and software that collect and share data about themselves and their surroundings. The data collected by IoT devices can be used to monitor and control the devices, as well as to automate processes and make decisions. IoT devices are used in a variety of applications, including home automation, connected cars, industrial automation, and healthcare.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Blockchain, NFT  tokenization'), 
    'Blockchain, NFT & tokenization')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_A blockchain is a digital ledger of all cryptocurrency transactions'), 
    'A blockchain is a digital ledger of all cryptocurrency transactions. It is constantly growing as "completed" blocks are added to it with a new set of recordings. Each block contains a cryptographic hash of the previous block, a timestamp, and transaction data. Bitcoin nodes use the block chain to differentiate legitimate Bitcoin transactions from attempts to re-spend coins that have already been spent elsewhere. One of its challenges is its high capacity requirements, as the entire blockchain is stored on each full node in the network. Also, the processing time for transactions is not instantaneous as it needs to be verified by each node in the network. The blockchain can be used to create a virtual economy, with virtual assets and virtual currencies. The blockchain can be used to create a decentralized marketplace, where buyers and sellers can trade directly, without the need for a central authority.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Threat intelligence'), 'Threat intelligence')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Threat intelligence is the actionable knowledge'), 
    'Threat intelligence is the actionable knowledge about an existing or imminent threat that can help organizations to understand, anticipate, and defend against malicious activity. It can be used to support a variety of business objectives, including identifying and prioritizing security risks, improving incident response, and informing security strategy. When used effectively, threat intelligence can help organizations to better understand the evolving threat landscape and make more informed decisions about how to protect their assets and data.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Quantum Computing'), 'Quantum Computing')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_Quantum Computing is a new and'), 
    'Quantum Computing is a new and upcoming technology with the potential to revolutionize the way businesses operate. Its main advantage is its ability to perform calculations at a much faster rate than traditional computers, making it ideal for businesses that require complex calculations or data processing. There are two main approaches: Gate and Annealing.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_5G'), '5G')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_5G is the fifth generation of wireless technology'), 
    '5G is the fifth generation of wireless technology that promises faster speeds, lower latency, and more reliability than ever before. businesses are expected to benefit from 5G in a number of ways, including the ability to connect more devices to the internet, support for new applications such as augmented reality and virtual reality, and improved efficiency and productivity. 5G and Edge Computing are also expected to enable new business models and create new opportunities in the IoT space. Regarding telco businesses, 5G is seen as an opportunity to offer new services and create new revenue streams and in automotive, it is seen as a way to enable autonomous driving.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Cloud Platforms'), 'Cloud Platforms')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_A cloud platform is a type of computing'), 
    'A cloud platform is a type of computing infrastructure that allows users to access and manage virtualized computing resources over the internet. These resources can include servers, storage, and software applications, and can be scaled up or down as needed. Some common applications and use cases for cloud platforms include website hosting, data storage and backups, software development and testing, big data processing, and disaster recovery')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Economy of Things'), 'Economy of Things')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_The economy of things (EoT) refers to the use'), 
    'he economy of things (EoT) refers to the use of internetconnected devices, such as sensors and other forms of IoT (Internet of Things) technology, to gather data and enable new business models and processes. This can include things like smart cities, connected homes, and industrial IoT applications. The EoT enables new business models by using the data generated by these devices to improve efficiency, reduce costs, and create new revenue streams. Some examples of EoT applications and use cases include: Smart cities, using IoT technologies to improve city services and infrastructure management Industrial IoT, using IoT to improve the efficiency and productivity of manufacturing, transportation and logistics Connected homes, using IoT to improve home automation, energy management and security Predictive maintenance, using IoT to monitor and analyze data')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Market Intelligence Platform/div_Digital Twin (Modelation  Simulation)'), 
    'Digital Twin (Modelation & Simulation)')

WebUI.verifyElementText(findTestObject('ObjetosManuales/Page_Market Intelligence Platform/Div_contenidos/Page_Market Intelligence Platform/div_There is no single definition of digital twin,'), 
    'here is no single definition of digital twin, but at a high level, it is generally understood to be a digital replica of a physical object or system that can be used for various purposes such as monitoring, predictive maintenance, and optimization.')

