### Functional requirements

1. The `system` shall allow to add a personalized note when assigning a `workout routine`<sup>2</sup>.
2. The `system` shall allow the creation of new `access credentials` <sup>3</sup>  for new `users`.
3. The `system` shall provide the creation of new `workout routines`.
4. The `system` shall allow to mark as `skipped`<sup>4</sup> exercises or sets of a workout routine.
5. The `system` shall provide the creation of additional types of memberships and coupons.
6. The `system` shall filter gyms by name, address, city and country.

Extra:
1. The `system` shall store all the `users’` `workout routines`.
2. The `system` shall notify the user when a new weekly `workout report`<sup>1</sup> is available.



### Dictionary

>  
> 1.  **Workout report** : Using the data from workout routines such reps done for an exercise,weights used, skipped$^{(4)}$ exercise,workouts done during the week, time spent exercising, ecc (==da aggiungere o togliere elementi cambiati per la docuemntazione finale==)
> 2. **Workout routine**: Its composed by a variable number of exercises and each one of them has a variable number of reps to be done, each exercise needs to have a weight target to use.
> 3. **Access credentials** : we have different types of credentials, one for the receptions that is created by signing up to the service has a gym, and we have a type for users of the gym and trainers that is created by the reception, the access system is the same for everyone but the interface changes for each level of user
> 4. **Skipped**: You can register a exercise/training/rep as skipped for whatever reason, this is useful when you want to keep track of what you have to recover/focus and to keep the trainer informed on how your training is going.