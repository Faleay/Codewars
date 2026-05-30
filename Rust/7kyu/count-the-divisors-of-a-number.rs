fn divisors(n: u32) -> u32 {
    let mut count = 0;
    for i in 1..n+1
    {
        if n%i == 0
        {
            count += 1;
        }
    }
    return count;
}
