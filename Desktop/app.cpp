#include "app.h"

#include "wx/frame.h"

IMPLEMENT_APP(App);

bool App::OnInit()
{
    wxFrame *frame = new wxFrame((wxFrame*) NULL, -1, _T("Hello World"));
    frame->CreateStatusBar();
	frame->SetStatusText(_T("Hello World"));
	frame->Show(true);
	SetTopWindow(frame);
	return true;
}