import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Matrix");
        miPelicula.setFechaDeLanzamiento(1999);
        miPelicula.setDuracionEnMinutos(108);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.8);
        miPelicula.evalua(9.2);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        System.out.println("\n**************************\n");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("la Casa del Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Terminator");
        otraPelicula.setFechaDeLanzamiento(1984);
        otraPelicula.setDuracionEnMinutos(136);

        System.out.println("\n**************************\n");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus películas favoritas " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(100);

        filtroRecomendacion.filtra(episodio);





    }

}