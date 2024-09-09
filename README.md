# <center>등산을 사랑하는 당신을 위한 서비스, 산타</center>
---
![산타 서비스 메인 사진](https://private-user-images.githubusercontent.com/124546770/365633826-4d37a264-accb-4934-860c-5cc59a919871.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU4ODMwMTUsIm5iZiI6MTcyNTg4MjcxNSwicGF0aCI6Ii8xMjQ1NDY3NzAvMzY1NjMzODI2LTRkMzdhMjY0LWFjY2ItNDkzNC04NjBjLTVjYzU5YTkxOTg3MS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOVQxMTUxNTVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0wMWMwYzM2YmFmNzA2MjcxMzcyMTk2ZGQ3ZDE1ZWYzY2FkZDUxZTY3OTkxYWViZTc5Yzc4MGZkZWQzMDcyNDg0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.lhhRum0KB3Qb-M0teYjSiloY3jX5H2BMRPDAfViUcmI)
- 산타
- 등산을 좋아하는 사람을 위한 모임 서비스

## **서비스 목적**
---
**등산을 좋아하는 유저들 간의 모임을 활성화 하여 더욱 즐거운 등산생활을 즐길 수 있도록 한다.**

## 서비스 목표
---
- 유저가 직접 참여하여 다양한 카테고리의 모임을 생성/참여하여 커뮤니티를 이룸
- 사용자가 선호 카테고리를 선택하여 선호 카테고리별 모임 조회를 통한 모임 선택의 어려움 감소
- 생성된 다양한 챌린지를 통해 사용자들이 사이트를 이용함에 있어 동기부여 제공
- 랭킹 시스템(유저가 완료한 업적 + 유저가 등반한 산의 누적 높이)를 통한 등산에 대한 동기부여 제공

## 프로젝트 구조 및 아키텍처
---
![아키텍처](https://private-user-images.githubusercontent.com/124546770/365635724-a2598ba4-f67f-47d5-97f6-ce89bb488783.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU4ODMwMzEsIm5iZiI6MTcyNTg4MjczMSwicGF0aCI6Ii8xMjQ1NDY3NzAvMzY1NjM1NzI0LWEyNTk4YmE0LWY2N2YtNDdkNS05N2Y2LWNlODliYjQ4ODc4My5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOVQxMTUyMTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iODM2MzM2ODU0MGQxYWQ5ZThjODc2YzdlY2VkNWE0YzYzNmY1YjM4ZmQ2YjkzMWM3Njk0YmExZDg4OWE3MTg4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.xi-Nx1Y1ZhNFZ5iKlLt1bCsPJ0CW0Jwz4mVW9uDBzIo)

## ERD
---
![산타 erd](https://private-user-images.githubusercontent.com/124546770/365635620-1bcc6119-712a-4411-b5c5-ef77fcd48ec7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU4ODMwNzYsIm5iZiI6MTcyNTg4Mjc3NiwicGF0aCI6Ii8xMjQ1NDY3NzAvMzY1NjM1NjIwLTFiY2M2MTE5LTcxMmEtNDQxMS1iNWM1LWVmNzdmY2Q0OGVjNy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOVQxMTUyNTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01NTFlMDdmOTUxNTAwZTM3NTAxMzA1NjEwYWEzMzc3NzM5YWI4Yjk0YzIxOWJjNzg3MjMzZDVhNzZkMzMzZjUzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.CMzJmDBcwY0du4Bnfm7O_1uSsJ3RpVJ4NLRrGhQ1em0)

## 플로우차트
---
![산타 플로우차트](https://private-user-images.githubusercontent.com/124546770/365636301-19200757-9905-457a-9be5-eb8177c53b3c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU4ODMxMTQsIm5iZiI6MTcyNTg4MjgxNCwicGF0aCI6Ii8xMjQ1NDY3NzAvMzY1NjM2MzAxLTE5MjAwNzU3LTk5MDUtNDU3YS05YmU1LWViODE3N2M1M2IzYy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOVQxMTUzMzRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iOTdhZGIxYTYxZjU3ODczMzIyMDVmZGFjYWFjYjdkMzgwMWUzZTg3YThiNzJkZWFiYTc5YTQ0MDAyZjE3NGRkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.txpitaQiYUm4QUiSOC97v-n7j6hHuKgo-jMx03doP78)

## 와이어프레임
---
![산타 와이어프레임](https://private-user-images.githubusercontent.com/124546770/365635292-03502676-d56b-4c95-a895-e2c1ffa21f70.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU4ODMxNDIsIm5iZiI6MTcyNTg4Mjg0MiwicGF0aCI6Ii8xMjQ1NDY3NzAvMzY1NjM1MjkyLTAzNTAyNjc2LWQ1NmItNGM5NS1hODk1LWUyYzFmZmEyMWY3MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOVQxMTU0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jY2FlZGI5NWU4ODkzZmQ3YTcxODgyNDY3ZmZkNDRmMDkwYjYyNDllZTg5NzE0Yjg3MzBmYjQ4MDg4YWU2ZGI0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.clLZm9oC5qMPLql8WPBKhzy5D_C6eLjkjma5vDo36Eo)

## 세부 기술스텍
---
> 프론트엔드 

<img alt="typescript" src ="https://img.shields.io/badge/typescript-3178C6.svg?&style=for-the-badge&logo=typescript&logoColor=white"/> <img alt="react" src ="https://img.shields.io/badge/react-61DAFB.svg?&style=for-the-badge&logo=react&logoColor=white"/> <img alt="TanStack Query" src ="https://img.shields.io/badge/TanStack Query-FF4154.svg?&style=for-the-badge&logo=reactquery&logoColor=white"/> <img alt="gitlab" src ="https://img.shields.io/badge/gitlab-FC6D26.svg?&style=for-the-badge&logo=gitlab&logoColor=white"/> <img alt="sass" src ="https://img.shields.io/badge/sass-CC6699.svg?&style=for-the-badge&logo=sass&logoColor=white"/> <img alt="reacthookform" src ="https://img.shields.io/badge/reacthookform-EC5990.svg?&style=for-the-badge&logo=reacthookform&logoColor=white"/>

<br/>

> 백엔드
<br/>
<img alt="springboot" src ="https://img.shields.io/badge/springboot-6DB33F.svg?&style=for-the-badge&logo=springboot&logoColor=white"/> <img alt="springsecurity" src ="https://img.shields.io/badge/springsecurity-6DB33F.svg?&style=for-the-badge&logo=springsecurity&logoColor=white"/> <img alt="mysql" src ="https://img.shields.io/badge/mysql-4479A1.svg?&style=for-the-badge&logo=mysql&logoColor=white"/> <img alt="postman" src ="https://img.shields.io/badge/postman-FF6C37.svg?&style=for-the-badge&logo=postman&logoColor=white"/> 

<br/>

> 서버
<br/>
<img alt="docker" src ="https://img.shields.io/badge/docker-2496ED.svg?&style=for-the-badge&logo=docker&logoColor=white"/> <img alt="nginx" src ="https://img.shields.io/badge/nginx-009639.svg?&style=for-the-badge&logo=nginx&logoColor=white"/> <img alt="jenkins" src ="https://img.shields.io/badge/jenkins-D24939.svg?&style=for-the-badge&logo=jenkins&logoColor=white"/> <img alt="amazon aws" src ="https://img.shields.io/badge/amazon aws-232F3E.svg?&style=for-the-badge&logo=amazonaws&logoColor=white"/> <img alt="amazon ec2" src ="https://img.shields.io/badge/amazon ec2-FF9900.svg?&style=for-the-badge&logo=amazonec2&logoColor=white"/> <img alt="amazonelasticache" src ="https://img.shields.io/badge/amazon elasticache-C925D1.svg?&style=for-the-badge&logo=amazonelasticache&logoColor=white"/>

<br/>
<img alt="typescript" src ="https://img.shields.io/badge/typescript-3178C6.svg?&style=for-the-badge&logo=typescript&logoColor=white"/> <img alt="react" src ="https://img.shields.io/badge/react-61DAFB.svg?&style=for-the-badge&logo=react&logoColor=white"/> <img alt="TanStack Query" src ="https://img.shields.io/badge/TanStack Query-FF4154.svg?&style=for-the-badge&logo=reactquery&logoColor=white"/>, 
<img alt="gitlab" src ="https://img.shields.io/badge/gitlab-FC6D26.svg?&style=for-the-badge&logo=gitlab&logoColor=white"/>
<img alt="sass" src ="https://img.shields.io/badge/sass-CC6699.svg?&style=for-the-badge&logo=sass&logoColor=white"/>
<img alt="reacthookform" src ="https://img.shields.io/badge/reacthookform-EC5990.svg?&style=for-the-badge&logo=reacthookform&logoColor=white"/>

<br/>
<img alt="springboot" src ="https://img.shields.io/badge/springboot-6DB33F.svg?&style=for-the-badge&logo=springboot&logoColor=white"/>
<img alt="springsecurity" src ="https://img.shields.io/badge/springsecurity-6DB33F.svg?&style=for-the-badge&logo=springsecurity&logoColor=white"/>
<img alt="MySQL" src ="https://img.shields.io/badge/mysql-4479A1.svg?&style=for-the-badge&logo=mysql&logoColor=white"/>
<img alt="jenkins" src ="https://img.shields.io/badge/jenkins-D24939.svg?&style=for-the-badge&logo=jenkins&logoColor=white"/>
<img alt="ubuntu" src ="https://img.shields.io/badge/ubuntu-E95420.svg?&style=for-the-badge&logo=ubuntu&logoColor=white"/>
<img alt="docker" src ="https://img.shields.io/badge/docker-2496ED.svg?&style=for-the-badge&logo=docker&logoColor=white"/>
<img alt="nginx" src ="https://img.shields.io/badge/nginx-009639.svg?&style=for-the-badge&logo=nginx&logoColor=white"/>
<img alt="amazonec2" src ="https://img.shields.io/badge/amazonec2-FF9900.svg?&style=for-the-badge&logo=amazonec2&logoColor=white"/>
<img alt="amazons3" src ="https://img.shields.io/badge/amazons3-569A31.svg?&style=for-the-badge&logo=amazons3&logoColor=white"/>
<img alt="amazonrds" src ="https://img.shields.io/badge/amazonrds-527FFF.svg?&style=for-the-badge&logo=amazonrds&logoColor=white"/>

<br/>
<img alt="gitlab" src ="https://img.shields.io/badge/gitlab-FC6D26.svg?&style=for-the-badge&logo=gitlab&logoColor=white"/>
<img alt="swagger" src ="https://img.shields.io/badge/swagger-85EA2D.svg?&style=for-the-badge&logo=swagger&logoColor=white"/>
<img alt="figma" src ="https://img.shields.io/badge/figma-F24E1E.svg?&style=for-the-badge&logo=figma&logoColor=white"/>
<img alt="notion" src ="https://img.shields.io/badge/notion-000000.svg?&style=for-the-badge&logo=notion&logoColor=white"/>
<img alt="discord" src ="https://img.shields.io/badge/discord-5865F2.svg?&style=for-the-badge&logo=discord&logoColor=white"/>

## 서비스 기능 명세
---
### 1. 유저 기능
> - Spring Security + JWT 기반 사용자 인증/인가
> - 회원
>    - 회원가입시 비밀번호 인코딩
>    - 이메일 인증(비밀번호 재발급)
> - 로그인
>    - AccessToken 과 RefreshToken 발급
>    - AccessToken 만료되면 RefreshToken으로 newAccessToken 발급
>    - 카카오 소셜로그인 성공 후 자체 JWT 발급
> - 선호 키워드 등록

### 2. 모임 기능
> - 회원
>    - 모임 생성
>        - 생성한 회원은 모임장(id) 부여
>        - 생성시 모임카테고리, 선호태그 등 설정
>    - 조회
>        - 선호 카테고리 및 태그 사용자 검색어 기반 모임&검색어 조회
>        - 최신순, 인기순 기반 필터링
>        - 모임 참여인원 조회 가능
>    - 유저 신고 기능
> - 모임장
>    - 모임 수정 가능
>    - 모임페이지 삭제 가능

### 3.  챌린지 기능
> - 챌린지는 자동으로 수행되며 100% 완료 후 업적 트로피 획득

### 4.  인증 기능
> - 산 정상 좌표값 기반으로 정상 및 등반높이 인증
> - 등반한 정상 개수와 누적 높이를 기록

### 5. 랭킹
> - 사용자가 인증한 데이터(높이, 완료한 챌린지)를 기반으로  점수를 산출하여 랭킹시스템 생성

### 6. 관리자(Admin)
> - 회원관리 : 전체 회원 정보 조회(신고 내역 등) 및 회원 정보 삭제 기능
> - 챌린지 관리 : 챌린지 업로드 및 삭제
> - 카테고리 관리 : 카테고리 수정 및 삭제 기능

## 역할분담
---
| 훈련생 | 역할  | 담당업무 |
| --- | --- | ---- |
| 옥찬혁 | 팀장  | 백엔드  |
| 나정균 | 팀원  | 백엔드  |
| 민지원 | 팀원  | 백엔드  |
| 김경혜 | 팀원  | 프론트  |
| 윤혜원 | 팀원  | 프론트  |
| 진채영 | 팀원  | 프론트  |

