
import './App.css';
import Navbar from './Components/Navbar';
import Boton from './Components/Boton';
import Card from './Components/card';

function App() {

  return (
    <div className="App">
      <Navbar />
      <section className="presentacion">
        <div className='nombreEmpresa'>
          <h1>¡LetsGuide!</h1>
          <div className='parrafobienvenida'>
          <p>Te llevaremos al siguiente nivel...</p>
          </div>
        </div>
        <div className='botonespresentacion'>
          <Boton texto='Iniciar sesión' />
          <Boton texto='Sobre nosotros' />
        </div>
      </section>
      <section className='contenedornosotros'>
            <div className="imagenlogo">
              <img src="src/imgs/logofondo.jpg.jpg" alt="" width={500} height={500}/>
            </div>
            <div className="contenidonosotros">
            <h2>¿Quienes Somos?</h2>
            <p>Somos una compañia que te acompañará en tus experiencias y vivencias inolvidables</p>
            </div>
      </section>
      <section>
        <div className="resena">
          Reseñas
        </div>
        <div className="contentcards">
          <div className="card1">
          <Card titulo = "Eva Elle" contenido='"Gracias por construir esta pagina, la cual me será de mucha ayuda para mis próximos viajes, facilitándome los conocimientos del lugar"'/>
          <Card titulo = "Eva Elle" contenido='"Gracias por construir esta pagina, la cual me será de mucha ayuda para mis próximos viajes, facilitándome los conocimientos del lugar"'/>
          <Card titulo = "Eva Elle" contenido='"Gracias por construir esta pagina, la cual me será de mucha ayuda para mis próximos viajes, facilitándome los conocimientos del lugar"'/>
          </div>
        </div>
      </section>
    </div>

  )
}

export default App;
