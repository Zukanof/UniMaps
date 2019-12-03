/// <reference types="Cypress" />

context('Location', () => {
  beforeEach(() => {
	cy.visit('http://unimaps.herokuapp.com/')
	cy.contains('Logar').click();
  })

  it('Adiciona pavilhao', () => {
  

  cy.get('.btn-floating.btn-large.modal-trigger').click();
  cy.get('#criarPavilhao input[name="nome"]').type('reitoria {enter}')
  cy.contains('reitoria')

  })
  
  it('edita pavilhão', () => {
	  cy.contains('edit').click();
	  cy.get('#editarPavilhao input[name="nome"]').type('recepcao {enter}')
	  cy.contains('recepcao')
})
	
it('deleta pavilão', () => {
	cy.contains('delete').click();
	cy.get('recepcao').should('not.exist')
})

})
