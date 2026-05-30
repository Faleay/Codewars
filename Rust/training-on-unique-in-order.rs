fn unique_in_order<T>(sequence: T) -> Vec<T::Item>
where
    T: std::iter::IntoIterator,
    T::Item: std::cmp::PartialEq + std::fmt::Debug,
{
    let mut result = Vec::new();
    for _item in sequence{
        if result.len() > 0{
           if result[result.len()-1] != _item{
               result.push(_item);
            }
        }
        else{
            result.push(_item)
        }
    }
    return result
}
