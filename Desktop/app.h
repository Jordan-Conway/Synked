#ifndef DESKTOP_APP
#define DESKTOP_APP

#include <wx/app.h>

class App : public wxApp
{
    public:
        virtual bool OnInit();
};

DECLARE_APP(App);

#endif