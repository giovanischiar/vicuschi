if [ -e $@.j ]
then
	rm $@.j
fi
if [ -e $@.class ]
then
	rm $@.class
fi
java Main $@ >> $@.j && java -jar jasmin.jar $@.j && java $@