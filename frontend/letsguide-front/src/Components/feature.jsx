
const Feature = () => {
  return (
    <section className="text-gray-600 body-font">
  <div className="container px-5 py-24 mx-auto flex flex-wrap">
    <div className="lg:w-1/2 w-full mb-10 lg:mb-0 rounded-lg overflow-hidden">
      <img alt="feature" className="object-cover object-center h-full w-full" src="https://media.istockphoto.com/id/627380386/es/foto/pareja-cog%C3%A1ndose-de-la-mano-y-viajando-juntos.jpg?s=612x612&w=0&k=20&c=n3RjTm7Lm7CLtdDbeNYIp-EoML4df3auzqpfMWtl3zA="/>
    </div>
    <div className="flex flex-col flex-wrap lg:py-6 -mb-10 lg:w-1/2 lg:pl-12 lg:text-left text-center">
      <div className="flex flex-col mb-10 lg:items-start items-center">
        <div className="w-12 h-12 inline-flex items-center justify-center rounded-full bg-indigo-100 text-indigo-500 mb-5">
          <svg fill="none" stroke="currentColor" className="w-6 h-6 stroke-linecap-round stroke-linejoin-round stroke-2" viewBox="0 0 24 24">
            <path d="M22 12h-4l-3 9L9 3l-3 9H2"></path>
          </svg>
        </div>
        <div className="flex-grow">
          <h2 className="text-gray-900 text-lg title-font font-medium mb-3">Conocimiento Profundo y Experiencia Local</h2>
          <p className="leading-relaxed text-base">Nuestros guías turísticos son expertos locales altamente capacitados que conocen a fondo la cultura, la historia y los lugares de interés de cada destino. Esto garantiza que obtendrás información enriquecedora y perspectivas auténticas que no encontrarás en guías genéricas o en línea.</p>
            <svg fill="none" stroke = "currentColor" className="w-4 h-4 ml-2 stroke-linecap-round stroke-linejoin-round stroke-2" viewBox="0 0 24 24">
            </svg>
        </div>
      </div>
      <div className="flex flex-col mb-10 lg:items-start items-center">
        <div className="w-12 h-12 inline-flex items-center justify-center rounded-full bg-indigo-100 text-indigo-500 mb-5">
          <svg fill="none" stroke = "currentColor" className="w-6 h-6 stroke-linecap-round stroke-linejoin-round stroke-2" viewBox="0 0 24 24">
            <circle cx="6" cy="6" r="3"></circle>
            <circle cx="6" cy="18" r="3"></circle>
            <path d="M20 4L8.12 15.88M14.47 14.48L20 20M8.12 8.12L12 12"></path>
          </svg>
        </div>
        <div className="flex-grow">
          <h2 className="text-gray-900 text-lg title-font font-medium mb-3">Experiencia sin Preocupaciones</h2>
          <p className="leading-relaxed text-base">Al elegir nuestros servicios, te liberas de la preocupación de planificar cada detalle de tu viaje. Nuestros guías se encargarán de la logística, como horarios, transportes y reservas, permitiéndote relajarte y disfrutar al máximo de tu experiencia de viaje.</p>
          <a className="mt-3 text-indigo-500 inline-flex items-center">Learn More
            <svg fill="none" stroke = "currentColor"className="w-4 h-4 ml-2 stroke-linecap-round stroke-linejoin-round stroke-2" viewBox="0 0 24 24">
              <path d="M5 12h14M12 5l7 7-7 7"></path>
            </svg>
          </a>
        </div>
      </div>
      <div className="flex flex-col mb-10 lg:items-start items-center">
        <div className="w-12 h-12 inline-flex items-center justify-center rounded-full bg-indigo-100 text-indigo-500 mb-5">
          <svg fill="none" stroke = "currentColor"className="w-6 h-6 stroke-2 stroke-linecap-round stroke-linejoin-round" viewBox="0 0 24 24">
            <path d="M20 21v-2a4 4 0 00-4-4H8a4 4 0 00-4 4v2"></path>
            <circle cx="12" cy="7" r="4"></circle>
          </svg>
        </div>
        <div className="flex-grow">
          <h2 className="text-gray-900 text-lg title-font font-medium mb-3">Momentos Inolvidables y Conexiones Personales</h2>
          <p className="leading-relaxed text-base">Nuestros guías turísticos no solo te mostrarán los lugares turísticos, sino que también te ayudarán a descubrir joyas escondidas y crearás conexiones personales con la comunidad local. Te llevarán a experiencias auténticas, lo que hará que tu viaje sea memorable y significativo.</p>
          <a className="mt-3 text-indigo-500 inline-flex items-center">Learn More
            <svg fill="none" stroke = "currentColor" className="w-4 h-4 ml-2 stroke-2 stroke-linecap-round stroke-linejoin-round" viewBox="0 0 24 24">
              <path d="M5 12h14M12 5l7 7-7 7"></path>
            </svg>
          </a>
        </div>
      </div>
    </div>
  </div>
</section>
  )
}

export default Feature;