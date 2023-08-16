# Abdale Abukar

## Egna reflektioner
Under den här uppgiften har jag fått en djupare förståelse för testdriven utveckling (TDD) och vikten av att skapa välstrukturerade tester. Jag har också insett hur kraftfulla mock-objekt kan vara när det gäller att isolera enheter under testning. Genom att följa TDD-metoden har jag kunnat bryta ner problemet i mindre delar och skapa pålitliga tester som hjälper till att identifiera eventuella problem tidigt i utvecklingsprocessen.
## Projektet

### Beskrivning av projektet
Uppgiften gick ut på att testa en webbapplikation som använder en extern tredjepartstjänst för att hämta väderprognoser. Huvudmålet var att skapa omfattande tester för klassen WeatherService med hjälp av JUnit och mock-objekt, och att skriva en detaljerad testrapport som dokumenterar resultaten.

### Vad du har gjort
Jag har utvecklat en serie JUnit-tester för WeatherService-klassen och implementerat mock-objekt för att simulera externa anrop till väderprognostjänsten. Genom att använda olika typer av assertions har jag verifierat att metoder i WeatherService fungerar korrekt och returnerar förväntade resultat. Jag har också följt beskrivningen för att skapa en detaljerad testrappo

## Planering

### Lösningsförslag innan uppgiften påbörjas

#### Skisser 
Jag skapade skisser som visade hur olika klasser skulle interagera, särskilt fokus på hur WeatherService, WeatherAPI och WeatherData skulle kopplas samman.

#### Hur du tänker försöka lösa uppgiften.
Jag planerade att börja med att skriva tester baserat på beskrivningen och sedan använda dessa tester som vägledning för att implementera kod i WeatherService. Jag ville använda TDD-metoden genom hela processen.

#### Pseudokod.
Klass WeatherAPI:
    Metod getWeatherData(city):
        Returnera fördefinierad JSON-respons baserat på staden

Klass WeatherService:
    Konstruktor WeatherService(weatherAPI):
        Spara weatherAPI som attribut

    Metod getWeather(city):
        Hämta väderdata från weatherAPI genom att anropa getWeatherData med city
        Extrahera relevant data från JSON-responsen och skapa ett WeatherData-objekt
        Returnera WeatherData-objektet

Klass WeatherData:
    Attribut temperature, windSpeed, clouds, city, country
    Metoder getTemperature, getWindSpeed, getClouds, getCity, getCountry

Junit-tester för WeatherService:
    Skapa en mock av WeatherAPI
    Konfigurera mocken att returnera fördefinierad JSON-respons för olika testfall

    Testfall 1 - getWeather med giltig stad:
        Anropa getWeather med giltig stad
        Jämför returnerad WeatherData med förväntad väderdata

    Testfall 2 - getWeather med ogiltig stad:
        Anropa getWeather med ogiltig stad
        Jämför returnerat felmeddelande med förväntat felmeddelande

    Testfall 3 - getWeather vid nätverksavbrott:
        Konfigurera mocken att simulera nätverksavbrott
        Anropa getWeather med valfri stad
        Jämför returnerat felmeddelande med förväntat felmeddelande

    Testfall 4 - Tidsåtgång för getWeather:
        Mät tiden för att anropa getWeather med en giltig stad
        Jämför tiden med max tillåten svarstid

Skriv en detaljerad testrapport baserat på testfallen och deras resultat.


#### Diagram.
![Diagram](tdd-och-mock-Abukar-Abdale/pic/diagram.png)



### Project och projekthantering enligt Scrum/Kanban
https://trello.com/invite/b/NAh6nqvZ/ATTI8c4d25fb3a57b1b2cdcb26e47c210c7e7EEF976D/kanban-template
Jag använde Trello för att hantera projektet och skapade en projektstyrelse för att organisera mina arbetsuppgifter. Jag valde att använda en kombination av Scrum och Kanban, där jag delade upp arbetsuppgifterna i mindre bitar och följde dem steg för steg genom projektet.

## Arbetet och dess genomförande

### Vad som varit svårt
Jag använde GitHub för att hantera projektet och skapade en projektstyrelse för att organisera mina arbetsuppgifter. Jag valde att använda en kombination av Scrum och Kanban, där jag delade upp arbetsuppgifterna i mindre bitar och följde dem steg för steg genom projektet.

### Beskriv lite olika lösningar du gjort
Jag testade olika sätt att konfigurera mock-objekt för att få dem att bete sig enligt mina förväntningar. Dessutom experimenterade jag med olika JSON-parserbibliotek och metoder för att extrahera data från JSON-responsen.

### Beskriv något som var besvärligt att få till
Det var knepigt att förstå hur mock-objekt skulle konfigureras korrekt för att simulera anrop till den externa tjänsten. Dessutom var det utmanande att hitta rätt väg i JSON-responsen för att hämta specifika datavärden

### Beskriv om du fått byta lösning och varför i sådana fall
Det var knepigt att förstå hur mock-objekt skulle konfigureras korrekt för att simulera anrop till den externa tjänsten. Dessutom var det utmanande att hitta rätt väg i JSON-responsen för att hämta specifika datavärden

## Reflektion & Slutsatser

### Vad gick bra
Jag känner att jag lyckades skapa omfattande tester och använda mock-objekt för att isolera den enhet som testades. Testrapporten ger en tydlig översikt över testfallen och resultaten.

### Vad gick dåligt
Jag känner att jag lyckades skapa omfattande tester och använda mock-objekt för att isolera den enhet som testades. Testrapporten ger en tydlig översikt över testfallen och resultaten.

### Vad har du lärt dig
Jag har lärt mig vikten av att skriva omfattande tester och använda mock-objekt för att isolera enheter under testning. Dessutom har jag förbättrat min förmåga att använda TDD-metoden för att utveckla kod.

### Vad hade ni gjort annorlunda om ni gjort om projektet
Om jag hade gjort om projektet skulle jag ha varit mer noggrann med konfigurationen av mock-objekt och hur jag extraherade data från JSON-responsen. Jag skulle också ha börjat med att skapa en noggrann plan för tester och implementering innan jag faktiskt började koda.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Med de kunskaper jag har fått under kursen ser jag möjligheter att använda testdriven utveckling och mock-objekt i min framtida programutveckling. Dessa tekniker kan hjälpa mig att skapa mer robusta och pålitliga program genom att isolera och testa olika delar av koden. Jag ser också möjligheter att bidra mer aktivt till projekt som använder dessa metoder för att förbättra kodkvaliteten och minska risken för fel.
