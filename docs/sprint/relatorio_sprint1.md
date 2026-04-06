# Sprint 1

## Meta da Sprint
Implementar o núcleo inicial do sistema de gestão acadêmica, permitindo a geração automática do cronograma e a organização dos planejamentos por curso e semestre, validando o fluxo principal da aplicação.

---

## Definition of Ready (DoR)

- [x] User Stories claras e focadas no usuário  
- [x] Critérios de aceitação definidos  
- [x] Protótipos das telas disponíveis ([Wireframes da Sprint 1](docs/sprint/wireframe_s1/README.md))  
- [x] Estrutura inicial do banco de dados definida  
- [x] Tecnologias definidas (Java, JavaFX, MaterialFX)  
- [x] Sem dependências bloqueadoras  
- [x] Responsáveis definidos  

## Definition of Done (DoD)

- [ ] Código versionado no GitHub  
- [ ] Branch criada e PR aberto para code review  
- [ ] Código revisado e aprovado  
- [x] Funcionalidade implementada e funcional na interface  
- [ ] Integração entre telas funcionando  
- [x] Testes manuais realizados  
- [x] Nenhum bug crítico conhecido  
- [x] Documentação atualizada (README e Sprint)  
- [x] Funcionalidade demonstrada (PO)  

---

## User Stories da Sprint

| Rank | User Stories | Estimativa | Status |
|------|--------------|------------|--------|
| 1 | US-001 – Gerar cronograma automático | 3 pontos | concluído |
| 2 | US-002 – Separar planejamentos por curso e semestre | 2 pontos | concluído |

**Total estimado: 5 pontos**

---

## Detalhamento das User Stories

### US-001 – Gerar cronograma automático

**Como professor**, quero que a tabela do semestre seja montada automaticamente,  
para não precisar gastar horas organizando manualmente as aulas.

#### Critérios de Aceitação
- O sistema deve gerar automaticamente o cronograma com base nos dados informados.  
- A tabela deve ser exibida corretamente em um TableView.  
- Cada coluna deve estar corretamente vinculada aos dados.  
- O cronograma deve seguir uma ordem lógica de datas e conteúdos.  
- A interface deve permitir a visualização completa do planejamento.  

#### DoR
- Estrutura inicial do banco de dados definida.  
- Modelagem das entidades necessárias (planejamento, temas, disciplinas).  
- Protótipo da tela de cronograma definido.  
- Definição das colunas da TableView.  
- Regras básicas de geração do cronograma definidas.  

#### DoD
- Cronograma gerado automaticamente sem erros.  
- TableView populada corretamente.  
- Testes manuais realizados.  
- Integração com interface funcional.  
- Documentação atualizada.  
- Funcionalidade demonstrada.  

---

### US-002 – Separar planejamentos por curso e semestre

**Como professor**, quero separar os planejamentos por curso e por semestre,  
para não confundir turmas diferentes.

#### Critérios de Aceitação
- O sistema deve permitir selecionar curso e semestre.  
- Os dados exibidos devem ser filtrados corretamente.  
- A tabela deve atualizar dinamicamente conforme o filtro.  
- Não deve haver mistura de dados entre turmas.  

#### DoR
- Estrutura de dados com curso e semestre definida.  
- Protótipo da tela com filtros definido.  
- Componentes de interface definidos.  

#### DoD
- Filtro funcionando corretamente.  
- ComboBox populadas com dados válidos.  
- TableView atualizada conforme seleção.  
- Testes manuais realizados.  
- Funcionalidade demonstrada.  
- Documentação atualizada.  

---

## Tarefas

| User Story | Tarefa | Responsável | Tempo Estimado | Status |
|------------|--------|-------------|----------------|--------|
| US-001 | Modelar estrutura inicial do banco de dados | Dev Team | 2h30 | concluído |
| US-001 | Criar classes Java (Model) | Dev Team | 2h | concluído |
| US-001 | Criar tela com TableView (Scene Builder) | Dev Team | 8h30 | concluído |
| US-001 | Conectar TableView com dados | Dev Team | 4h | concluído |
| US-001 | Implementar lógica de geração do cronograma | Dev Team | 5h | concluído |
| US-001 | Testes manuais | Dev Team | 1h30 | concluído |
| US-002 | Criar ComboBox (curso e semestre) | Dev Team | 4h | concluído |
| US-002 | Integrar ComboBox com banco de dados | Dev Team | 2h | concluído |
| US-002 | Implementar lógica de filtragem | Dev Team | 4h | concluído |
| US-002 | Atualizar TableView com filtros | Dev Team | 4h | concluído |
| US-002 | Testes manuais | Dev Team | 1h30 | concluído |

---

## Alocação de Tarefas

| User Story | Tarefa | Responsável | Status |
|------------|--------|-------------|--------|
| US-001 | Geração de cronograma automático | Dev Team | concluído |
| US-002 | Filtro por curso e semestre | Dev Team | concluído |

---

## Regras da Sprint

- Nenhuma tarefa deve exceder 10h. 
- Priorizar entrega visuais antes de melhorias funcionais.
- Ajustes e melhorias ficam para próximas sprints.  
