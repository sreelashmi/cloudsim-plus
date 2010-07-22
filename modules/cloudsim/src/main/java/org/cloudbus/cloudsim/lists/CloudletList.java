/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation
 *               of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009, The University of Melbourne, Australia
 */

package org.cloudbus.cloudsim.lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

/**
 * CloudletList is a link to store Cloudlets.
 *
 * @author 		Rodrigo N. Calheiros
 * @since       CloudSim Toolkit 1.0 Beta
 * @invariant 	$none
 */
public class CloudletList {
	
    /**
     * Gets the by id.
     *
     * @param cloudletList the cloudlet list
     * @param id the id
     *
     * @return the by id
     */
    public static <T extends Cloudlet> T getById(List<T> cloudletList, int id) {
    	for (T cloudlet : cloudletList) {
    		if (cloudlet.getCloudletId() == id) {
    			return cloudlet;
    		}
    	}
    	return null;
	}

    /**
     * Sorts the Cloudlets in a list based on their lengths.
     *
     * @param cloudletList the cloudlet list
     *
     * @pre $none
     * @post $none
     */
    public static <T extends Cloudlet> void sort(List<T> cloudletList) {
    	Collections.sort(cloudletList, new Comparator<T>() {
            /**
             * Compares two objects.
             *
             * @param a     the first Object to be compared
             * @param b     the second Object to be compared
             *
             * @return the value 0 if both Objects are numerically equal;
             * a value less than 0 if the first Object is
             * numerically less than the second Object;
             * and a value greater than 0 if the first Object is
             * numerically greater than the second Object.
             *
             * @throws ClassCastException   <tt>a</tt> and <tt>b</tt> are expected
             * to be of type <tt>Cloudlet</tt>
             *
             * @pre a != null
             * @pre b != null
             * @post $none
             */
            public int compare(T a, T b) throws ClassCastException {
                Double cla = Double.valueOf(a.getCloudletTotalLength());
                Double clb = Double.valueOf(b.getCloudletTotalLength());
                return cla.compareTo(clb);
            }
		});
    }

}