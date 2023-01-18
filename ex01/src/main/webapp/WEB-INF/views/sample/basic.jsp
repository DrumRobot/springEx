<!-- views/sample.jsp 또는 views/sample/basic.jsp -->
<a href="basicOnlyGet">/basicOnlyGet</a>
<form action="ex01Model">
	<input type="text" name="name" value="AAA" /> 
	<input type="number" name="age" value="10" />
	<button>ex01Model</button>
</form>
<form action="ex02">
	<input type="text" name="name" value="AAA" /> 
	<input type="number" name="age" value="10" />
	<button>ex02</button>
</form>
<form action="ex02List">
	<input type="checkbox" name="ids" value="111" /> 
	<input type="checkbox" name="ids" value="222" />
	<input type="checkbox" name="ids" value="333" />
	<button>ex02List</button>
</form>
<form action="ex02Array">
	<input type="checkbox" name="ids" value="111" /> 
	<input type="checkbox" name="ids" value="222" />
	<input type="checkbox" name="ids" value="333" />
	<button>ex02Array</button>
</form>
<form action="ex02Bean">
	<input type="text" name="list[0].name" value="aaa" /> 
	<input type="text" name="list[1].name" value="BBB" />
	<input type="text" name="list[2].name" value="CCC" />
	<button>ex02Bean</button>
</form>
