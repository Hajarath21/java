import heapq
from collections import defaultdict

def compress(text):
    frequency = defaultdict(int)
    for char in text:
        frequency[char] += 1

    heap = [[weight, [char, ""]] for char, weight in frequency.items()]
    heapq.heapify(heap)

    while len(heap) > 1:
        lo = heapq.heappop(heap)
        hi = heapq.heappop(heap)
        for pair in lo[1:]:
            pair[1] = '0' + pair[1]
        for pair in hi[1:]:
            pair[1] = '1' + pair[1]

        heapq.heappush(heap, [lo[0] + hi[0]] + lo[1:] + hi[1:])

    huffman_code = dict(heap[0][1:])
    compressed_text = "".join([huffman_code[char] for char in text])
    return compressed_text

def decompress(compressed_text, huffman_code):
    inverse_code = {value: key for key, value in huffman_code.items()}
    current_bits = ""
    decoded_text = ""

    for bit in compressed_text:
        current_bits += bit
        if current_bits in inverse_code:
            decoded_text += inverse_code[current_bits]
            current_bits = ""

    return decoded_text
