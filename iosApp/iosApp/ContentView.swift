import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(Greeting().greet())
            .font(.system(size: 28))
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
