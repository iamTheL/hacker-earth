import unittest
from seating_arrangement import find_seating

class SeatingArrangement(unittest.TestCase):


    def setUp(self):
        pass

    def test_find_seating(self):
        self.assertEqual(find_seating(90),"91 WS")

if __name__ == '__main__':
    unittest.main()
        