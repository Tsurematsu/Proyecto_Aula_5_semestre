'use client';
import { Button, Navbar } from 'flowbite-react';

export default function NavbarWithCTAButton() {
  return (
    <Navbar fluid rounded>
      <Navbar.Brand href="#">
        <img src="src/imgs/logo720.png" className="mr-3 h-6 sm:h-20" alt="Flowbite React Logo" />
        <span className="self-center whitespace-nowrap text-xl font-semibold dark:text-white">Let&apos;s Guide</span>
      </Navbar.Brand>
      <div className="flex md:order-2">
        <Button className='bg-indigo-500'>¡A darle!</Button>
        <Navbar.Toggle />
      </div>
      <Navbar.Collapse>
        <Navbar.Link href="#" active>Inicio</Navbar.Link>
        <Navbar.Link href="#">Servicios</Navbar.Link>
        <Navbar.Link href="#">Contactar</Navbar.Link>
        <Navbar.Link href="#">Trabaja con nosotros</Navbar.Link>
        <Navbar.Link href="#">COP</Navbar.Link>
      </Navbar.Collapse>
    </Navbar>
  )
}