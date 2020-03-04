import { sleep } from"k6";
import http from "k6/http";

export let options = {
  duration: "2m",
  vus: 50
};


export default function() {
  http.get("https://ak-hello-world-circle.cfapps.io/");
  sleep(2);
}