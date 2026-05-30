// I started to learn Rust with fundamentals

fn powers_of_two(n: u8) -> Vec<u128> {
    let mut vec_res : Vec<u128> = Vec::new();
    for _num in 0..n+1{
        vec_res.push(2_u128.pow(_num.into()));
    }
    return vec_res;
}
