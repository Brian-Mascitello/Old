# -*- coding: utf-8 -*-
"""
Author:     Brian Mascitello
Date:       3/6/2016
School:     Arizona State University

Book:       Web Scraping with Python by Ryan Mitchell
Website:    http://pythonscraping.com/

Info:       Reads a website using Python.
"""

from urllib.request import urlopen
html = urlopen("http://www.pythonscraping.com/pages/page1.html")
print(html.read())
