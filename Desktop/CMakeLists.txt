cmake_minimum_required(VERSION 3.16)
project(wx_test LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_package(wxWidgets REQUIRED COMPONENTS core base)
include(${wxWidgets_USE_FILE})

add_executable(desktop ./app.cpp)

target_link_libraries(desktop ${wxWidgets_LIBRARIES})
