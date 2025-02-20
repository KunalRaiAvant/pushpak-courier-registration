// Auth Services 
import { supabase } from "./supabase";

export const login = async (email, password) => {
  let { data, error } = await supabase.auth.signInWithPassword({ email, password });

  if (error) {
    throw error;
  }

  return data;
};
