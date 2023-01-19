<form action="ex03">
	<input type="text" name="title" value="${empty todoDTO.title? 'test' : todoDTO.title}" /> 
	<input type="date" name="dueDate" value="${empty todoDTO.dueDate? '2023-01-01' : todoDTO.dueDate}" />
	<button>ex03</button>
</form>
