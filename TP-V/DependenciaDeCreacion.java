//////////////////////////////////////Ejerecicio 13////////////////////////

        Usuario usuario = new Usuario("Rudesprit", "Norber.96@gmail.com");

        GeneradorQR generadorQR = new GeneradorQR();

        generadorQR.generar("KSGG556", usuario);

//////////////////////////////////////Ejerecicio 14////////////////////////

        Proyecto proyecto = new Proyecto("Mundo Salvaje", "156 Minutos");

        EditorVideo editorVideo = new EditorVideo();

        editorVideo.exportar("Documental", proyecto);
