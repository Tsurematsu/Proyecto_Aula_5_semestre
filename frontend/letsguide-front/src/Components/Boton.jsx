'use client';
export default function Boton() {
  const paginaDestino = "login.jsx"; // Reemplaza con la URL de tu página destino

  return (
    <a href={paginaDestino} className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
      Ir a Otra Página
    </a>
  );
}
