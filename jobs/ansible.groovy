// Jobs to release productized version of Ansible Collection
new ansible.Builder(collectionName:'redhat-csp-download').build(this)
new ansible.Builder(collectionName:'jws-ansible-playbook').build(this)
new ansible.Builder(collectionName:'ansible_collections_jcliff').build(this)
// CI Jobs for Ansible Middleware
//   Note that each CI job needs to increment the moleculeBuildId as
//   this translate into a port number for SSHd running on the slave
//   container (and thus, needs to be unique).
new ansibleCi.Builder(projectName:'jws-ansible-playbook', moleculeBuildId: 22001).build(this)
new ansibleCi.Builder(projectName:'wildfly', moleculeBuildId: 23001).build(this)
EapView.jobList(this, 'Ansible Collections', 'ansible-collection.*')
EapView.jobList(this, 'Ansible CI', 'ansible-ci.*')
