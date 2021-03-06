.. java:import:: org.cloudbus.cloudsim.brokers DatacenterBroker

.. java:import:: org.cloudbus.cloudsim.utilizationmodels UtilizationModel

.. java:import:: org.cloudbus.cloudsim.utilizationmodels UtilizationModelFull

.. java:import:: org.cloudbus.cloudsim.vms Vm

CloudletSimple
==============

.. java:package:: org.cloudbus.cloudsim.cloudlets
   :noindex:

.. java:type:: public class CloudletSimple extends CloudletAbstract

   Cloudlet implements the basic features of an application/job/task to be executed by a \ :java:ref:`Vm`\  on behalf of a given user. It stores, despite all the information encapsulated in the Cloudlet, the ID of the VM running it.

   :author: Rodrigo N. Calheiros, Anton Beloglazov

   **See also:** :java:ref:`DatacenterBroker`

Constructors
------------
CloudletSimple
^^^^^^^^^^^^^^

.. java:constructor:: public CloudletSimple(long length, int pesNumber, UtilizationModel utilizationModel)
   :outertype: CloudletSimple

   Creates a Cloudlet with no priority or id. The id is defined when the Cloudlet is submitted to a \ :java:ref:`DatacenterBroker`\ . The file size and output size is defined as 1.

   :param length: the length or size (in MI) of this cloudlet to be executed in a VM (check out \ :java:ref:`setLength(long)`\ )
   :param pesNumber: number of PEs that Cloudlet will require
   :param utilizationModel: a \ :java:ref:`UtilizationModel`\  to define how the Cloudlet uses CPU, RAM and BW. To define an independent utilization model for each resource, call the respective setters.

   **See also:** :java:ref:`.setUtilizationModelCpu(UtilizationModel)`, :java:ref:`.setUtilizationModelRam(UtilizationModel)`, :java:ref:`.setUtilizationModelBw(UtilizationModel)`

CloudletSimple
^^^^^^^^^^^^^^

.. java:constructor:: public CloudletSimple(long length, int pesNumber)
   :outertype: CloudletSimple

   Creates a Cloudlet with no priority or id. The id is defined when the Cloudlet is submitted to a \ :java:ref:`DatacenterBroker`\ . The file size and output size is defined as 1.

   \ **NOTE:**\  By default, the Cloudlet will use a \ :java:ref:`UtilizationModelFull`\  to define CPU utilization and a \ :java:ref:`UtilizationModel.NULL`\  for RAM and BW. To change the default values, use the respective setters.

   :param length: the length or size (in MI) of this cloudlet to be executed in a VM (check out \ :java:ref:`setLength(long)`\ )
   :param pesNumber: number of PEs that Cloudlet will require

CloudletSimple
^^^^^^^^^^^^^^

.. java:constructor:: public CloudletSimple(long length, long pesNumber)
   :outertype: CloudletSimple

   Creates a Cloudlet with no priority or id. The id is defined when the Cloudlet is submitted to a \ :java:ref:`DatacenterBroker`\ . The file size and output size is defined as 1.

   \ **NOTE:**\  By default, the Cloudlet will use a \ :java:ref:`UtilizationModelFull`\  to define CPU utilization and a \ :java:ref:`UtilizationModel.NULL`\  for RAM and BW. To change the default values, use the respective setters.

   :param length: the length or size (in MI) of this cloudlet to be executed in a VM (check out \ :java:ref:`setLength(long)`\ )
   :param pesNumber: number of PEs that Cloudlet will require

CloudletSimple
^^^^^^^^^^^^^^

.. java:constructor:: public CloudletSimple(long id, long length, long pesNumber)
   :outertype: CloudletSimple

   Creates a Cloudlet with no priority, file size and output size equal to 1.

   \ **NOTE:**\  By default, the Cloudlet will use a \ :java:ref:`UtilizationModelFull`\  to define CPU utilization and a \ :java:ref:`UtilizationModel.NULL`\  for RAM and BW. To change the default values, use the respective setters.

   :param id: the unique ID of this cloudlet
   :param length: the length or size (in MI) of this cloudlet to be executed in a VM (check out \ :java:ref:`setLength(long)`\ )
   :param pesNumber: the pes number

Methods
-------
compareTo
^^^^^^^^^

.. java:method:: @Override public int compareTo(Cloudlet o)
   :outertype: CloudletSimple

   Compare this Cloudlet with another one based on \ :java:ref:`getLength()`\ .

   :param o: the Cloudlet to compare to
   :return: {@inheritDoc}

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: CloudletSimple

