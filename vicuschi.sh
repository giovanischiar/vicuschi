IFS='.' read -r -a files <<< "${@}"
file=${files[0]}

if [ -e "${file}.j" ]
then
	rm "${file}.j"
fi
if [ -e "${file}.class" ]
then
	rm "${file}.class"
fi

java Main $@ >> ${file}.j && java -jar jasmin.jar ${file}.j && java ${file}