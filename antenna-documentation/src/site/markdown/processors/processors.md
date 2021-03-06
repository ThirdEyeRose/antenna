## Processors
The second phase of the workflow pipeline continues with processors. The processor phase consists of enricher and validators.
The enrichers enrich the artifacts with missing information by means of external interfaces such as e.g. SW360. The validators validate
specific attributes of the artifacts. Aside from a processor enriching artifact data with data from the `antennaconf.xml`, there are a number of processors possible for Antenna:

### Enrichers
* [Maven Artifact resolver](./artifact-resolver.html)
* [Child Jar resolver](./child-jar-resolver.html)
* [License Knowledgebase resolver](./license-knowledgebase-resolver.html)
* [License resolver](./license-resolver.html)
* [Manifest resolver](manifest-resolver.html)
* [P2 Resolver](./p2-resolver.html)
* [SW360 Enricher](./sw360-enricher.html)

### Validators
* [Coordinates validator](./coordinates-validator.html)
* [Source Validator](./source-validator.html)
* [License Validator](./license-validator.html)
* [Match State Validator](./match-state-validator.html)
* [Security Issue Validator](./security-issue-validator.html)
* [Rule Engine](./rule-engine.html)