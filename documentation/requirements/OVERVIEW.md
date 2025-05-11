# MyShitlist

## Overview
A web-based system that helps users manage and share lists of companies, products, people or organizations
they choose to avoid based on personal preferences or ethical considerations.

## Key Features
- Create and manage personal shitlists
- Shitlist items should have the target, the reason and a note at least.
- Share shitlist entries with other users
- Check products against your shitlists before purchasing
- Search and filter company/product information
- Receive notifications about blocklisted companies
- The frontpage should have a feature to show the worst offenders of the year, month or week,
  where the total number of additions to shitlists is added. 
- It should also be possible to view the most common complaints about targets. 

## User profile
- Created on first login
- PII kept to a bare minimum, preferably only email or phone number for notifications
- Site unique username

## Database
- Postgresql
- Stateful sets? 

## Kubernetes
- network policies for pod-pod communication
- TLS at ingress level
- Authentication and rate limiting at ingress
- Loadbalancer
- internal service discovery using Kubernetes Services
- Secure secrets management
- Storage classes for postgres persistence
- Configmaps for configuration
- Vault?

## Monitoring
- Prometheus for monitoring
- Grafana for monitoring
- Loki for logging aggregation

## Purpose
This system enables consumers to:
- Make informed purchasing decisions
- Track shitty behavior of targets based on personal criteria
- Collaborate with like-minded individuals
- Stay updated about companies in their shitlist

## Technical Stack
- Backend: Jakarta EE with Quarkus
- Database: postgresql
- Frontend: webpage and android app
- Environment: Kubernetes cloud

## Glossary

| Term      | Definition                                                                                                          |
|-----------|---------------------------------------------------------------------------------------------------------------------|
| Target    | The target of a user's disgruntlement                                                                               |
| User      | User of the system                                                                                                  |
| Shitlist  | A user's list of targets                                                                                            |
| Shititem  | A single record in a list that describes the what (target), why (the reason they are on the list) and a description |
| Reason    | The cause for adding a target to a shitlist                                                                         |
| Frontpage | The frontpage of the system with statistics and other publicly shared data                                          |
|           |                                                                                                                     |
|           |                                                                                                                     |
|           |                                                                                                                     |
|           |                                                                                                                     |
|           |                                                                                                                     |
|           |                                                                                                                     |

## Links
[API](API.md) \
[Android](MOBILE_PHONE.md) \
[Auth](AUTH.md) \
[Common](COMMON.md) \
[Ubuntu Touch](UBUNTU_TOUCH.md) \
[Web](WEB.md) \
[Non-functional](NON_FUNCTIONAL.md) \