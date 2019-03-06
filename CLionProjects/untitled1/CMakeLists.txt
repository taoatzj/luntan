cmake_minimum_required(VERSION 3.8)
project(untitled1)

set(CMAKE_CXX_STANDARD 11)

if (UNIX)
    message("on unix platfrom")
elseif(WIN32)
    message("on windows platfrom")
else()
    message("on a unsupport platfrom")
endif ()

set(SOURCE_FILES main.cpp)
add_executable(untitled1 ${SOURCE_FILES})