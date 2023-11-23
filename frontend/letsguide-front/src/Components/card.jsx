'use client';

import { Card } from 'flowbite-react';

export default function DefaultCard({contenido, titulo}) {
  return (
    <Card
      className="max-w-sm"
      href="#"
    >
      <h5 className="text-2xl font-bold tracking-tight text-gray-900 dark:text-white">
        <p>
          {titulo}
        </p>
      </h5>
      <p className="font-normal text-gray-700 dark:text-gray-400">
        <p>
          {contenido}
        </p>
      </p>
    </Card>
  )
}
