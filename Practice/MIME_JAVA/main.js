/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

function contains(a, obj) {
    var i = a.length;
    while (i--) {
       if (a[i] === obj) {
           return true;
       }
    }
    return false;
}


var arr ={};
var arrLow = {};
var N = parseInt(readline()); // Number of elements which make up the association table.
var Q = parseInt(readline()); // Number Q of file names to be analyzed.
for (var i = 0; i < N; i++) {
    var inputs = readline().split(' ');
    var EXT = inputs[0]; // file extension
    var MT = inputs[1]; // MIME type.
    arr[EXT]=MT;
    arrLow[EXT.toLowerCase()] = EXT;
   // printErr("ass "+EXT+":"+arr[EXT]);
}
for (var i = 0; i < Q; i++) {
    var FNAME = readline(); // One file name per line.
    var splitted;
    if(contains(FNAME,'.'))
    {
        splitted=FNAME.split('.'); 
        extension = splitted[splitted.length-1]; 
        if(arrLow[extension.toLowerCase()] != null)
        {
            //printErr("typ"splitted[splitted.length-1]);
            var finalExtension = arrLow[extension.toLowerCase()];
            printErr("debug "+arr[finalExtension]);
            print(arr[finalExtension]);
        }
    
        else
        {
                
            print("UNKNOWN");
        }   
    }
    else
    {
        print("UNKNOWN");
    }
    
    
    
}

// Write an action using print()
// To debug: printErr('Debug messages...');


// For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
