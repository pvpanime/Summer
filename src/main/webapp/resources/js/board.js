(async () => {
  const app = document.getElementById("app");
  const response = await fetch("/api/board/get")
  if (response.ok) {
    const jsonBody = await response.json()
    const data = jsonBody.data;
    const chunk = []
    for (const board of data) {
      chunk.push(`<section><h3>${board.title}</h3><div>${board.content}</div></section>`)
    }
    app.innerHTML = chunk.join("");
  } else {
    console.error("이런!!!! 뭔가 안좋은 일이 일어났습니다!")
    console.error(response)
  }

})()