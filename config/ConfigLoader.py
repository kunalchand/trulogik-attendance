from config.settings import EDGE_DRIVER_PATH
from utils.ArgsParser import ArgsParser


class ConfigLoader:
    @staticmethod
    def get_edge_driver_path(self):
        return EDGE_DRIVER_PATH

    @staticmethod
    def get_browser_options(self):
        self.detach = ArgsParser().parse_args()
        return self.detach
