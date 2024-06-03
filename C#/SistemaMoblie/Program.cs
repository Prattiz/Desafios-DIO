using DesafioPOO.Models;

Console.WriteLine("Smartphone Nokia: ");

SmartPhone nokia = new Nokia
(
    numero: "12345",
    modelo: "modelo 123",
    memoria: 8,
    imei: "321"
);
nokia.Ligar();
nokia.InstalarAplicativo("Telegram");

Console.WriteLine("\n");

Console.WriteLine("Smartphone Iphone: ");

SmartPhone iphone = new Iphone
(
    numero: "67890",
    modelo: "modelo 456",
    memoria: 12,
    imei: "123"
);
iphone.ReceberLigacao();
iphone.InstalarAplicativo("Youtube");