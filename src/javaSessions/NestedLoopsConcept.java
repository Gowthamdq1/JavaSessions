package javaSessions;

public class NestedLoopsConcept {

	public static void main(String[] args) {

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}

//		000 001 002 003 004 005 
//		010 011 012 013 014 015 
//		020 021 022 023 024 025 
//		030 031 032 033 034 035 
//		040 041 042 043 044 045 
//		050 051 052 053 054 055 
//		100 101 102 103 104 105 
//		110 111 112 113 114 115 
//		120 121 122 123 124 125 
//		130 131 132 133 134 135 
//		140 141 142 143 144 145 
//		150 151 152 153 154 155 
//		200 201 202 203 204 205 
//		210 211 212 213 214 215 
//		220 221 222 223 224 225 
//		230 231 232 233 234 235 
//		240 241 242 243 244 245 
//		250 251 252 253 254 255 
//		300 301 302 303 304 305 
//		310 311 312 313 314 315 
//		320 321 322 323 324 325 
//		330 331 332 333 334 335 
//		340 341 342 343 344 345 
//		350 351 352 353 354 355 
//		400 401 402 403 404 405 
//		410 411 412 413 414 415 
//		420 421 422 423 424 425 
//		430 431 432 433 434 435 
//		440 441 442 443 444 445 
//		450 451 452 453 454 455 
//		500 501 502 503 504 505 
//		510 511 512 513 514 515 
//		520 521 522 523 524 525 
//		530 531 532 533 534 535 
//		540 541 542 543 544 545 
//		550 551 552 553 554 555 

		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= 5; b++) {
				for (int c = 0; c <= 5; c++) {
					System.out.print(a + "" + b + c + " ");
				}
				System.out.println();
			}
		}

	}
}
