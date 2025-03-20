import sys


class ArgsParser:
    def parse_args(self):
        if len(sys.argv) > 1:
            if sys.argv[1] == "-o":
                return True
            elif sys.argv[1] == "-c":
                return False
            else:
                print("Invalid argument provided, closing browser...")
                sys.exit(1)
        return False
