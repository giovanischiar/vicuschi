public class ANTLRVicuschiListener extends VicuschiBaseListener {
	@Override
	public void exitFunction_call(VicuschiParser.Function_callContext ctx) {
		System.out.println(ctx.getText());
	}
}