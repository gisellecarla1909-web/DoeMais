// Selecionar ONG
function selecionarONG(nome) {
  localStorage.setItem("ong", nome);
  window.location.href = "doacao.html";
}

// Preencher ONG automaticamente
if (document.getElementById("ong")) {
  document.getElementById("ong").value = localStorage.getItem("ong");
}

// Salvar doação
function salvarDoacao(event) {
  event.preventDefault();

  const ong = document.getElementById("ong").value;
  const destinatario = document.getElementById("destinatario").value;
  const motivo = document.getElementById("motivo").value;

  const doacao = { ong, destinatario, motivo };

  let historico = JSON.parse(localStorage.getItem("historico")) || [];
  historico.push(doacao);

  localStorage.setItem("historico", JSON.stringify(historico));

  alert("Doação registrada!");
  window.location.href = "perfil.html";
}

// Mostrar histórico
if (document.getElementById("historico")) {
  let lista = document.getElementById("historico");
  let historico = JSON.parse(localStorage.getItem("historico")) || [];

  historico.forEach(d => {
    let li = document.createElement("li");
    li.textContent = ${d.ong} - ${d.destinatario} (${d.motivo});
    lista.appendChild(li);
  });
}
