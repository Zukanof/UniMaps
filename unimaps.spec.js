/// <reference types="Cypress" />

context('Location', () => {
  beforeEach(() => {
  })

  it('cy.location() - get window.location', () => {
  cy.visit('http://unimaps.herokuapp.com/')
  cy.contains('Logar').click();

  cy.get('.btn-floating.btn-large.modal-trigger').click();
  cy.get('#criarPavilhao input[name="nome"]').type('reitoria {enter}')
  cy.contains('reitoria')

  cy.contains('edit').click();
  cy.get('#editarPavilhao input[name="nome"]').type('recepcao {enter}')
  cy.contains('recepcao')

  cy.contains('delete').click();
  cy.contains('recepcao');
  })

})
