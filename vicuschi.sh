if [ -e $@.j ]
then
	rm $@.j &&
	rm $@.class
fi
java Main $@ >> $@.j && java -jar jasmin.jar $@.j && java $@